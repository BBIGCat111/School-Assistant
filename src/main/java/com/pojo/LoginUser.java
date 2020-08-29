package com.pojo;

import org.springframework.stereotype.Controller;


public class LoginUser {
    private String stu_id;
    private String stu_name;
    private String username;
    private String password;

    public String getStu_id(){
        return stu_id;
    }

    public void setStu_id(String stu_id){
        this.stu_id = stu_id;
    }

    public String getStu_name(){
        return stu_name;
    }

    public void setStu_name(String stu_name){
        this.stu_name = stu_name;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String toString(){
        return "User{" +
                "stu_id ='" + stu_id + '\'' +
                ", stu_name ='" + stu_name + '\'' +
                ", username ='" + username + '\'' +
                ", password ='" + password + '\'' +
                '}';
    }
}
