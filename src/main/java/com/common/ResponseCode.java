package com.common;

public enum  ResponseCode {
    SUCCESS(0, "response success"),
    LOGINFAILURE(-1, "username and password are wrong")

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
