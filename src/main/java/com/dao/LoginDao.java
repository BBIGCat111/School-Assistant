package com.dao;

import com.pojo.LoginUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginDao {
    //返回所有用户数据
    @Select("select * from login")
    public List<LoginUser> findAllUser();
}
