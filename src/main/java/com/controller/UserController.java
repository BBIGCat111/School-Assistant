package com.controller;

import com.pojo.User;
import com.service.UserService;
import com.returnRes.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user.co")
    @ResponseBody
    public ServerResponse<User> getUserById(){
        //System.out.println("进入UserController");

        //获取sesson
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        String stu_id = (String) request.getSession(true).getAttribute("stu_id");

        //System.out.println("stu_id : " + stu_id);

        User user = userService.getUserById(stu_id);
        return ServerResponse.createUserResponse(user);
    }
}
