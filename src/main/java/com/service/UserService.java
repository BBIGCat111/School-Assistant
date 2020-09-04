package com.service;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public User getUserById(String stu_id);

    public void updateUserInfoById(String stu_id, String stu_age, String stu_political, String stu_address
            , String stu_profess, String stu_class, String stu_phone, String stu_email);
}
