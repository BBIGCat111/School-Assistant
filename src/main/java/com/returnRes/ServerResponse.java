package com.Return;

import com.Return.ResponseCode;
import org.springframework.stereotype.Component;

public class ServerResponse<T> {
    private int code;

    private String info;

    private T data;

    public ServerResponse(int code, String info, T data){
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public int getCode(){
        return code;
    }

    public String getInfo(){
        return info;
    }

    public T getData(){
        return data;
    }

    public static <T> ServerResponse<T> createSuccessResponse(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo(), data);
    }

    public static <T> ServerResponse<T> createFailResponse(){
        return new ServerResponse<T>(ResponseCode.FAILURE.getCode(), ResponseCode.FAILURE.getInfo(), null);
    }

    public static <T> ServerResponse<T> createCourseResponse(T data){
        return new ServerResponse<T>(ResponseCode.COURSE.getCode(), ResponseCode.COURSE.getInfo(), data);
    }

}
