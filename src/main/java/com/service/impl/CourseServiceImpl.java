package com.service.impl;

import com.pojo.Course;
import com.service.CourserService;
import com.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourserService{
    @Autowired
    private CourseDao courseDao;

    public Course showCourse(String studentId){ return courseDao.showCourse(studentId); }
}
