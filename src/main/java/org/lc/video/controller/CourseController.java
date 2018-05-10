package org.lc.video.controller;

import org.lc.video.model.Course;
import org.lc.video.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private ICourseService service;


    @RequestMapping("course/all")
    public String allCourse(Model model){

        List<Course> courseList = service.findAllCourse();
        model.addAttribute("courseList",courseList);
        System.out.println("-------->查询到的课程：");
        for (Course course :
                courseList) {
            System.out.println(course.getTitle());
        }
        return "admin/course";
    }

}
