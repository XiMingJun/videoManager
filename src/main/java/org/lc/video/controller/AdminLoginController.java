package org.lc.video.controller;

import org.lc.video.model.Admin;
import org.lc.video.model.Video;
import org.lc.video.service.IAdminService;
import org.lc.video.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdminLoginController {

    @Autowired
    private IAdminService adminService;//注入一个service接口的实现类对象

    @Autowired
    private IHomeService videoService;

    @RequestMapping("admin/loginPage")
    public String loginPage() {

        return "admin/login";
    }


    @RequestMapping("admin/login")
    public String login(Admin admin, Model model){

        System.out.println("---->>登录："+admin.toString());
        //调用service的登录验证业务逻辑

        boolean isValide = false;

        try {
            isValide =adminService.checkLogin(admin);
        } catch (Exception e){

            System.out.println(e.getMessage());
        }
        if (isValide){


            List<Video> videoList = videoService.findAllVideo();
            model.addAttribute("videoList",videoList);

            for (Video video :
                    videoList) {
                System.out.println(video.toString());
            }
            return "admin/home";
        }
        else{

            return "admin/login";

        }
    }
}
