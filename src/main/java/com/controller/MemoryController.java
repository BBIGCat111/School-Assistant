package com.controller;

import com.pojo.MemoryData;
import com.service.MemoryService;
import com.common.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MemoryController {
    @Autowired
    private MemoryService memoryService;

    @RequestMapping("/memory")
    @ResponseBody
    public ServerResponse<MemoryData> getMemoryDataById(String newMemoryData, HttpServletRequest request){

        //获取sesson
        String studentId = (String) request.getSession(true).getAttribute("studentId");

        if(newMemoryData != null){
            memoryService.setMemoryDataById(studentId, newMemoryData);
        }

        return ServerResponse.createSuccessResponse(memoryService.getMemoryDataById(studentId));
    }
}
