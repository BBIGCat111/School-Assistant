package com.controller;

import com.pojo.MemoryData;
import com.service.MemoryService;
import com.returnRes.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MemoryController {
    @Autowired
    private MemoryService memoryService;

    @RequestMapping("/memory.eo")
    @ResponseBody
    public ServerResponse<MemoryData> getMemoryDataById(String newMemoryData){

        //获取sesson
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        String stu_id = (String) request.getSession(true).getAttribute("stu_id");

        if(newMemoryData != null){
            memoryService.setMemoryDataById(stu_id, newMemoryData);
        }

        MemoryData memoryData = memoryService.getMemoryDataById(stu_id);

        return ServerResponse.createMemoryResponse(memoryData);
    }
}
