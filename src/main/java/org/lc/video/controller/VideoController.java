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
}
