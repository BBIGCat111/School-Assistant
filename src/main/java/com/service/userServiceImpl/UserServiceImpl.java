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
}
