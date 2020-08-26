package com.Controller;

import com.Pojo.Course;
import com.Service.CourserService;
import com.Return.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CourseController {
    @Autowired
    private CourserService courserService;

    //显示课表
    @RequestMapping("/home.do")
    @ResponseBody
    public ServerResponse<Course> showCourse(){
        System.out.println("进入控制台");

        //获取sesson
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        String stu_id = (String) request.getSession(true).getAttribute("stu_id");

        System.out.println("sesson中的stu_id : " + stu_id);
        return ServerResponse.createCourseResponse(courserService.showCourse(stu_id));
    }
}
