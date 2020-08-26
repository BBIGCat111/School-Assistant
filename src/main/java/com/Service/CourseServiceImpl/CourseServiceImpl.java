package com.Service.CourseServiceImpl;

import com.Pojo.Course;
import com.Service.CourserService;
import com.Dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourserService{
    @Autowired
    private CourseDao courseDao;

    public Course showCourse(String stu_id){ return courseDao.showCourse(stu_id); }
}
