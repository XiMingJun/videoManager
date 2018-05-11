package org.lc.video.controller;

import org.lc.video.model.Admin;
import org.lc.video.model.Course;
import org.lc.video.model.Subject;
import org.lc.video.service.ICourseService;
import org.lc.video.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private ICourseService service;

    @Autowired
    private ISubjectService subjectService;

    @RequestMapping("course/all")
    public String allCourse(Model model){

        model.addAttribute("active","course");

        List<Course> courseList = service.findAllCourse();
        model.addAttribute("courseList",courseList);

        List<Subject> subjectList = subjectService.findAllSubject();
        model.addAttribute("subjectList",subjectList);

        return "admin/course";
    }

    /**
     * 更新，保存课程信息
     * */
    @RequestMapping("course/saveCourse")
    public String saveCourse(Course course, HttpServletRequest request){

        Admin admin = (Admin)request.getSession().getAttribute("sessionUser");

        if (course.getCourseId() != null){

            //更新操作
            course.setModifiedAdmin(admin.getAdminId());
            System.out.println("--------->>更新课程："+course.toString());
            service.updateCourse(course);
        }
        else{
            //插入操作
            System.out.println("--------->保存课程:"+course.toString());
            course.setGmtCreate(new Date());
            course.setCreateAdmin(admin.getAdminId());

            service.saveCourse(course);
        }

        return "redirect:/course/all.do";
    }

    /**
     * 删除课程
     * */
    @RequestMapping("course/delete.do")
    @ResponseBody//要返回json的话加这个注解
    public String deleteCourse(String course_id){


        System.out.println("删除课程："+course_id);

        int affectRows = 0;
        if (course_id != null){
           affectRows =  service.deleteCourse(course_id);
        }

        return affectRows > 0 ? "yes":"no";

    }

    @RequestMapping("course/search")
    public String searchCourse(String searchTitle,String searchSubId,Model model){

        System.out.println("---搜索："+searchTitle+","+searchSubId);

        List<Course> courseList = service.findCourse(searchTitle,searchSubId);
        model.addAttribute("courseList",courseList);

        List<Subject> subjectList = subjectService.findAllSubject();
        model.addAttribute("subjectList",subjectList);

        model.addAttribute("active","course");

        return "admin/course";

    }

}
