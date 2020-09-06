package com.service;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User getUserById(String studentId);

    void updateUserInfoById(String studentId, String studentAge, String studentPolitical, String studentAddress
            , String studentProfess, String studentClass, String studentPhone, String studentEmail);
}
