package com.dao;

import com.pojo.LoginUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    //返回所有登录数据
    String findLoginUser(@Param("username") String username, @Param("password") String password);

}
