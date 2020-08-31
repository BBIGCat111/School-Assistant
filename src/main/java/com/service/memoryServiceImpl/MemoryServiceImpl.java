package com.service.memoryServiceImpl;

import com.pojo.MemoryData;
import com.service.MemoryService;
import com.dao.MemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoryServiceImpl implements MemoryService {
    @Autowired
    private MemoryDao memoryDao;

    public MemoryData getMemoryDataById(String stu_id){
        return memoryDao.getMemoryDataById(stu_id);
    }

    public void setMemoryDataById(String stu_id, String memoryData) { memoryDao.setMemoryDataById(stu_id, memoryData); }
}
