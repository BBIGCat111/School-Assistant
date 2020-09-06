package com.controller;

import com.pojo.Course;
import com.service.CourserService;
import com.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CourseController {
    @Autowired
    private CourserService courserService;

    //显示课表
    @RequestMapping("/course.do")
    @ResponseBody
    public ServerResponse<Course> showCourse(HttpServletRequest request){
        //获取sesson
        String studentId = (String) request.getSession(true).getAttribute("studentId");

        Course course = courserService.showCourse(studentId);

        return ServerResponse.createSuccessResponse(course);
    }
}
