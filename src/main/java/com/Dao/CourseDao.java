package com.Dao;

import com.Pojo.Course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao {

    @Select("select * from course where stu_id = #{stu_id}")
    public Course showCourse(@Param("stu_id") String stu_id);

    
}
