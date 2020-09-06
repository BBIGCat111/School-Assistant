package com.service.userServiceImpl;

import com.pojo.User;
import com.service.UserService;
import com.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User getUserById(String stu_id){
        return userDao.getUserById(stu_id);
    }

    public void updateUserInfoById(String stu_id, String stu_age, String stu_political, String stu_address
            , String stu_profess, String stu_class, String stu_phone, String stu_email){
        userDao.updateUserInfoById(stu_id, stu_age, stu_political, stu_address, stu_profess, stu_class, stu_phone, stu_email);
    }
}
