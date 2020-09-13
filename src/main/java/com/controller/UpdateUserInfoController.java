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
public class UpdateUserInfoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/updateuserinfo")
    @ResponseBody
    public ServerResponse<User> updateUserInfoById(String studentAge, String studentPolitical, String studentAddress
            , String studentProfess, String studentClass, String studentPhone, String studentEmail, HttpServletRequest request){
        //获取sesson
        String studentId= (String) request.getSession(true).getAttribute("studentId");

        User user = userService.getUserById(studentId);

        if(!studentAge.equals(""))
            user.setStudentAge(studentAge);
        if(!studentPolitical.equals(""))
            user.setStudentPolitical(studentPolitical);
        if(!studentAddress.equals(""))
            user.setStudentAddress(studentAddress);
        if(!studentProfess.equals(""))
            user.setStudentProfess(studentProfess);
        if(!studentClass.equals(""))
            user.setStudentClass(studentClass);
        if(!studentPhone.equals(""))
            user.setStudentPhone(studentPhone);
        if(!studentEmail.equals(""))
            user.setStudentEmail(studentEmail);

        userService.updateUserInfoById(studentId, user.getStudentAge(), user.getStudentPolitical(), user.getStudentAddress(), user.getStudentProfess()
                                        ,user.getStudentClass(), user.getStudentPhone(), user.getStudentEmail());

        return ServerResponse.createSuccessResponse(null);
    }
}
