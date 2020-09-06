package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //返回用户数据
    User getUserById(String studentId);

    //修改用户数据
    void updateUserInfoById(@Param("studentId") String studentId, @Param("studentAge") String studentAge, @Param("studentPolitical") String studentPolitical, @Param("studentAddress") String studentAddress
                        , @Param("studentProfess") String studentProfess, @Param("studentClass") String studentClass, @Param("studentPhone") String studentPhone
                        , @Param("studentEmail") String studentEmail);
}
