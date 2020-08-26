package com.Service.LoginServiceImpl;

import com.Service.LoginService;
import com.Pojo.LoginUser;
import com.Dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginDao loginDao;

    //查询所有用户数据
    public List<LoginUser> findAllUser(){
        return  loginDao.findAllUser();
    }
}
