package com.returnRes;

import org.springframework.web.bind.annotation.ResponseBody;

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

    public static <T> ServerResponse<T> createResponse(int code, String info, T data){
        return new ServerResponse<T>(code, info, data);
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

    public static <T> ServerResponse<T> createUserResponse(T data){
        return new ServerResponse<T>(ResponseCode.USER.getCode(), ResponseCode.USER.getInfo(), data);
    }

    public static <T> ServerResponse<T> createUserInfoResponse(T data){
        return new ServerResponse<T>(ResponseCode.USERINFO.getCode(), ResponseCode.USERINFO.getInfo(), data);
    }

    public static <T> ServerResponse<T> createMemoryResponse(T data){
        return new ServerResponse<T>(ResponseCode.MEMORY.getCode(), ResponseCode.MEMORY.getInfo(), data);
    }
}
