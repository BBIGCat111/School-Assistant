package com.common;

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

    public static <T> ServerResponse<T> createLoginFailResponse(){
        return new ServerResponse<T>(ResponseCode.LOGINFAILURE.getCode(), ResponseCode.LOGINFAILURE.getInfo(), null);
    }

}
