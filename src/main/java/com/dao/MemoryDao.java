package com.dao;

import com.pojo.MemoryData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryDao {
    @Select("select * from memory where stu_id = #{stu_id}")
    public MemoryData getMemoryDataById(String stu_id);

    @Select("update memory set memoryData = #{memoryData} where stu_id = #{stu_id}")
    public void setMemoryDataById(@Param("stu_id") String stu_id, @Param("memoryData") String memoryData);
}
