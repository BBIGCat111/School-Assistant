package com.service.impl;

import com.service.LoginService;
import com.pojo.LoginUser;
import com.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;

    //查询所有用户数据
    public String findLoginUser(String username, String password){
        return  loginDao.findLoginUser(username, password);
    }
}
