package com.controller;

import com.pojo.User;
import com.service.UserService;
import com.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/home")
    @ResponseBody
    public ServerResponse<User> getUserById(HttpServletRequest request){

        //获取sesson
        String studentId = (String) request.getSession(true).getAttribute("studentId");

        User user = userService.getUserById(studentId);

        return ServerResponse.createSuccessResponse(user);
    }
}
