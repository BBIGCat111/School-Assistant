package com.controller;

import com.common.ResponseCode;
import com.pojo.LoginUser;
import com.service.LoginService;
import com.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public ServerResponse<LoginUser> findAllUser(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
        if(loginService.findLoginUser(username, password).equals(username)){
            //假如登录成功，设置sesson
            request.getSession(true).setAttribute("studentId", username);
            return ServerResponse.createSuccessResponse(null);           //登录成功
        }
        return ServerResponse.createLoginFailResponse();                 //登录失败
    }
}
