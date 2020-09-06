package com.dao;

import com.pojo.Course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao {
    //返回课程
    Course showCourse(@Param("studentId") String studentId);

    
}
