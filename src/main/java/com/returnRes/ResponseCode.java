package com.returnRes;

public enum  ResponseCode {
    SUCCESS(0, "Login Success"),
    FAILURE(-1, "Login Fail"),
    COURSE(100, "Show Course"),
    USER(200, "Get User"),
    MEMORY(300, "Get MemoryData")
    ;

    private int code;
    private String info;

    ResponseCode(int code, String info){
        this.code = code;
        this.info = info;
    }

    public int getCode(){
        return code;
    }

    public String getInfo(){
        return info;
    }
}
