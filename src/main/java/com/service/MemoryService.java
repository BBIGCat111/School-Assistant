package com.service;

import com.pojo.MemoryData;

public interface MemoryService {
    MemoryData getMemoryDataById(String studentId);

    void setMemoryDataById(String studentId, String memoryData);
}
