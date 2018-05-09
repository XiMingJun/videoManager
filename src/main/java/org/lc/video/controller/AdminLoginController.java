package org.lc.video.controller;

import org.lc.video.model.Admin;
import org.lc.video.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminLoginController {

    @Autowired
    private IAdminService adminService;//注入一个service接口的实现类对象


    @RequestMapping("admin/loginPage")
    public String loginPage() {

        return "admin/login";
    }


    @RequestMapping("admin/login")
    public String login(Admin admin){

        System.out.println("---->>登录："+admin.toString());
        //调用service的登录验证业务逻辑

        boolean isValide = false;

        try {
            isValide =adminService.checkLogin(admin);
        } catch (Exception e){

            System.out.println(e.getMessage());
        }
        if (isValide){

            return "admin/success";
        }
        else{
            System.out.println("登录失败，重新登录");
            return "admin/login";

        }
    }
}
