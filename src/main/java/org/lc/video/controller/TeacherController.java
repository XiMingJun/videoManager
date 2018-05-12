package org.lc.video.controller;

import org.lc.video.model.Teacher;
import org.lc.video.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @RequestMapping("teachers/all")
    public String findAll(Model model) {

        model.addAttribute("active","teacher");

        List<Teacher> teacherList = teacherService.findAllTeacher();
        model.addAttribute("teacherList",teacherList);

        System.out.println("-------->查询到的讲师：");

        for (Teacher teacher :
                teacherList) {
            System.out.println(teacher.getName());
        }
        return "admin/teacher";
    }

    @RequestMapping("teacher/save")
    public String saveTeacher(Teacher teacher){

        if (teacher.getTeacherId() != null){
            System.out.println("修改讲师信息："+teacher.toString());
            teacherService.updateTeacher(teacher);
        }
        else{

            System.out.println("保存讲师信息："+teacher.toString());
            teacherService.saveTeacher(teacher);
        }

        return "redirect:/teachers/all.do";
    }


    @RequestMapping("teacher/search")
    public String searchTeacher(String searchName,String searchGender,Model model){

        System.out.println("查询条件："+searchName+","+searchGender);
        model.addAttribute("active","teacher");//选中menu标识

        List<Teacher> teacherList = teacherService.findTeacher(searchName,searchGender);
        model.addAttribute("teacherList",teacherList);

        System.out.println("-------->查询到的讲师：");

        for (Teacher teacher :
                teacherList) {
            System.out.println(teacher.getName());
        }
        return "admin/teacher";
    }

    @RequestMapping("teacher/delete")
    @ResponseBody//返回字符串
    public String deleteTeacher(Teacher teacher){


        int num = teacherService.deleteTeacher(teacher);
        return num > 0 ? "yes" : "no";
    }
}
