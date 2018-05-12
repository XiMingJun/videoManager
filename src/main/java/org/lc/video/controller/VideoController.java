package org.lc.video.controller;

import org.lc.video.model.Course;
import org.lc.video.model.Teacher;
import org.lc.video.model.Video;
import org.lc.video.service.ICourseService;
import org.lc.video.service.ITeacherService;
import org.lc.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class VideoController {


    @Autowired
    private IVideoService videoService;
    @Autowired
    private ITeacherService teacherService;
    @Autowired
    private ICourseService courseService;


    @RequestMapping("videos/all")
    public String allVideo(Model model){


        model.addAttribute("active","video");

        //所有视频列表
        List<Video> videoList = videoService.findAllVideo();
        model.addAttribute("videoList",videoList);

        //所有讲师列表
        List<Teacher> teacherList = teacherService.findAllTeacher();
        model.addAttribute("teacherList",teacherList);

        //所有课程
        List<Course> courseList = courseService.findAllCourse();
        model.addAttribute("courseList",courseList);


        System.out.println("-------->查询到的视频：");
        for (Video teacher :
                videoList) {
            System.out.println(teacher.getTitle());
        }
        return "admin/video";
    }

    @RequestMapping("video/save")
    public String saveVideo(Video video){

        int num = videoService.saveVideo(video);
        if (num > 0){
            System.out.println("保存成功");
        }
        else{
            System.out.println("保存失败");
        }
        return "redirect:/videos/all.do";
    }

    @RequestMapping("video/delete")
    @ResponseBody
    public String deleteVideo(Video video){


        int num = videoService.deleteVideo(video);

        return num > 0? "yes":"no";
    }

    @RequestMapping("video/search")
    public String searchVideo(String searchTitle,String searchTeacher,String searchCourse,Model model){

        model.addAttribute("active","video");

        List<Video> videoList =  videoService.findVideo(searchTitle, searchTeacher, searchCourse);
        model.addAttribute("videoList",videoList);

        //所有讲师列表
        List<Teacher> teacherList = teacherService.findAllTeacher();
        model.addAttribute("teacherList",teacherList);

        //所有课程
        List<Course> courseList = courseService.findAllCourse();
        model.addAttribute("courseList",courseList);

        return "admin/video";

    }


}
