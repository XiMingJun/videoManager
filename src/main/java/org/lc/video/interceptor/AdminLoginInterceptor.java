package org.lc.video.interceptor;

import org.lc.video.model.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截器
 * */
public class AdminLoginInterceptor implements HandlerInterceptor {

    /**
     * 用户请求进入方法之前执行的操作
     * */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        //判断request中是否具有用户信息，没有信息代表用户未登录，跳转登录页面，有则正常进入访问

        HttpSession session = httpServletRequest.getSession();
        Object sessionUser = session.getAttribute("sessionUser");

        if (sessionUser != null){

            Admin admin = (Admin)sessionUser;
            System.out.println("用户【"+admin.getName()+"】通过拦截器请求"+httpServletRequest.getServletPath());
            return true;
        }
        else{
            //未登录，返回到登录页面
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/admin/login.do");
            return false;
        }
    }

    /**
     * 用户请求进入方法之后执行的操作
     * */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 在servlet后台controller 执行结束，并且jsp页面加载编译结束后准备返回html给客户端之前的操作
     * */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
