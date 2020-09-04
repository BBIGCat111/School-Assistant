package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //返回用户数据
    @Select("select * from user where stu_id = #{stu_id}")
    public User getUserById(String stu_id);

    //修改用户数据
    @Update("update user set stu_age = #{stu_age}, stu_political = #{stu_political}, stu_address = #{stu_address} , stu_profess = #{stu_profess}, stu_class = #{stu_profess}, stu_class = #{stu_class}, stu_phone = #{stu_phone}, stu_email = #{stu_email} where stu_id = #{stu_id}")
    public void updateUserInfoById(@Param("stu_id") String stu_id, @Param("stu_age") String stu_age, @Param("stu_political") String stu_political, @Param("stu_address") String stu_address
                        , @Param("stu_profess") String stu_profess, @Param("stu_class") String stu_class, @Param("stu_phone") String stu_phone
                        , @Param("stu_email") String stu_email);
}
