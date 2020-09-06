package com.service;

import com.pojo.LoginUser;

public interface LoginService {
    //查询所有用户数据
    String findLoginUser(String username, String password);
}
