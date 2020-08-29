package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //返回用户数据
    @Select("select * from user where stu_id = #{stu_id}")
    public User getUserById(String stu_id);
}
