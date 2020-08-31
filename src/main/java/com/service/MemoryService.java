package com.service;

import com.pojo.MemoryData;

public interface MemoryService {
    public MemoryData getMemoryDataById(String stu_id);

    public void setMemoryDataById(String stu_id, String memoryData);
}
