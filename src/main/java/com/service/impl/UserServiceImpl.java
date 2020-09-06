package com.service.impl;

import com.pojo.User;
import com.service.UserService;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User getUserById(String studentId){
        return userDao.getUserById(studentId);
    }

    public void updateUserInfoById(String studentId, String studentAge, String studentPolitical, String studentAddress
            , String studentProfess, String studentClass, String studentPhone, String studentEmail){
        userDao.updateUserInfoById(studentId, studentAge, studentPolitical, studentAddress, studentProfess, studentClass, studentPhone, studentEmail);
    }
}
