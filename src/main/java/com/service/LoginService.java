package com.service;

import com.pojo.LoginUser;

import java.util.List;

public interface LoginService {
    //查询所有用户数据
    public List<LoginUser> findAllUser();
}
