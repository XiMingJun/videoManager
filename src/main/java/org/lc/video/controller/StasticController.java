package org.lc.video.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 统计
 * */
@Controller
public class StasticController {


    @RequestMapping("admin/course_stastic")
    public String stasticCourse(Model model){

        model.addAttribute("active","stastic");
        return "admin/stastic";
    }
}
