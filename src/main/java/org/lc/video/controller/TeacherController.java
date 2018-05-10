package org.lc.video.controller;

import org.lc.video.model.Teacher;
import org.lc.video.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("teachers/all")
    public String findAll(Model model) {

        List<Teacher> teacherList = teacherService.findAllTeacher();
        model.addAttribute("teacherList",teacherList);

        System.out.println("-------->查询到的讲师：");

        for (Teacher teacher :
                teacherList) {
            System.out.println(teacher.getName());
        }
        return "admin/teacher";
    }
}
