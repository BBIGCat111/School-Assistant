package com.service.impl;

import com.pojo.MemoryData;
import com.service.MemoryService;
import com.dao.MemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryServiceImpl implements MemoryService {
    @Autowired
    private MemoryDao memoryDao;

    public MemoryData getMemoryDataById(String studentId){
        return memoryDao.getMemoryDataById(studentId);
    }

    public void setMemoryDataById(String studentId, String memoryData) { memoryDao.setMemoryDataById(studentId, memoryData); }
}
