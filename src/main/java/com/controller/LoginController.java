package com.controller;

import com.pojo.LoginUser;
import com.service.LoginService;
import com.returnRes.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

//注册、登录控制器
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    //登录
    @RequestMapping("/login")
    @ResponseBody
    public ServerResponse<LoginUser> findAllUser(@RequestParam("username") String username, @RequestParam("password") String password){
        //设置sesson
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        request.getSession(true).setAttribute("stu_id", username);

        List<LoginUser> list = loginService.findAllUser();
        for(LoginUser u : list){
            System.out.println(u.toString());
            if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
                return ServerResponse.createSuccessResponse(u);      //登录成功
            }
        }
        return ServerResponse.createFailResponse();                 //登录失败
    }
}
