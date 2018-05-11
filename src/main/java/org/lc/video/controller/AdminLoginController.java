package org.lc.video.controller;

import org.lc.video.model.Admin;
import org.lc.video.model.Course;
import org.lc.video.model.Teacher;
import org.lc.video.model.Video;
import org.lc.video.service.IAdminService;
import org.lc.video.service.ICourseService;
import org.lc.video.service.ITeacherService;
import org.lc.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class AdminLoginController {

    @Autowired
    private IAdminService adminService;//注入一个service接口的实现类对象

    @Autowired
    private IVideoService videoService;

    @Autowired
    private ITeacherService teacherService;
    @Autowired
    private ICourseService courseService;


    @RequestMapping("admin/loginPage")
    public String loginPage() {

        return "admin/login";
    }

    @RequestMapping("admin/login")
    public String login(Admin admin, HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {

        System.out.println("---->>登录："+admin.toString());

        List<Video> videoList = videoService.findAllVideo();
        model.addAttribute("videoList",videoList);
        model.addAttribute("active","video");//设置选中menu 标记

        //所有讲师列表
        List<Teacher> teacherList = teacherService.findAllTeacher();
        model.addAttribute("teacherList",teacherList);
        System.out.println("-------->查询到的讲师：");

        for (Teacher teacher :
                teacherList) {
            System.out.println(teacher.getName());
        }

        //所有课程
        List<Course> courseList = courseService.findAllCourse();
        model.addAttribute("courseList",courseList);
        System.out.println("-------->查询到的课程：");
        for (Course course :
                courseList) {
            System.out.println(course.getTitle());
        }

        //调用service的登录验证业务逻辑
        boolean isValide = false;
        try {
            isValide =adminService.checkLogin(admin);
        } catch (Exception e){

            System.out.println(e.getMessage());
        }

        Object sessionUser = request.getSession().getAttribute("sessionUser");
        if (sessionUser != null){
            //如果已经登录，直接返回
            return "admin/video";
        }

        if (isValide){


//            设置session
            request.getSession().setAttribute("sessionUser",admin);

            for (Video video :
                    videoList) {
                System.out.println(video.toString());
            }
            return "admin/video";
        }
        else{

            return "admin/login";

        }
    }

}
