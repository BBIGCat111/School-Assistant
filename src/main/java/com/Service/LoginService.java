package com.Service;

import com.Pojo.LoginUser;

import java.util.List;

public interface LoginService {
    //查询所有用户数据
    public List<LoginUser> findAllUser();
}
