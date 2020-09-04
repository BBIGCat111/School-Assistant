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
public class UpdateUserInfoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/updateuserinfo.go")
    @ResponseBody
    public ServerResponse<User> updateUserInfoById(String stu_age, String stu_political, String stu_address
            , String stu_profess, String stu_class, String stu_phone, String stu_email){

        System.out.println("进入UpdateUserInfoController");

        System.out.println(stu_age);
        System.out.println(stu_political);
        System.out.println(stu_address);
        System.out.println(stu_profess);
        System.out.println(stu_class);
        System.out.println(stu_phone);
        System.out.println(stu_email);

        //获取sesson
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        String stu_id = (String) request.getSession(true).getAttribute("stu_id");

        User user = userService.getUserById(stu_id);

        if(stu_age != "")
            user.setStu_age(stu_age);
        if(stu_political != "")
            user.setStu_political(stu_political);
        if(stu_address != "")
            user.setStu_address(stu_address);
        if(stu_profess != "")
            user.setStu_profess(stu_profess);
        if(stu_class != "")
            user.setStu_class(stu_class);
        if(stu_phone != "")
            user.setStu_phone(stu_phone);
        if(stu_email != "")
            user.setStu_email(stu_email);

        userService.updateUserInfoById(stu_id, user.getStu_age(), user.getStu_political(), user.getStu_address(), user.getStu_profess()
                                        , user.getStu_class(), user.getStu_phone(), user.getStu_email());

        return ServerResponse.createUserInfoResponse(user);
    }
}
