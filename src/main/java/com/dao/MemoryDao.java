package com.dao;

import com.pojo.MemoryData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryDao {
    //返回备忘录数据
    MemoryData getMemoryDataById(String studentId);

    //设置备忘录数据
    void setMemoryDataById(@Param("studentId") String studentId, @Param("memoryData") String memoryData);
}
