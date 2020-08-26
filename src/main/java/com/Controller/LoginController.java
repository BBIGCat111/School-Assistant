package com.Controller;

import com.Pojo.LoginUser;
import com.Service.LoginService;
import com.Return.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

//注册、登录控制器
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginService loginService;

    //登录
    @RequestMapping(value = "/login")
    @ResponseBody
    public ServerResponse<LoginUser> findAllUser(String username, String password){
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
