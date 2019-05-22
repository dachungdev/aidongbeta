package com.example.aidongprover2;

public class User{

    private static String UserName = "未登录";

    public static String getUserName(){
        return UserName;
    }

    public static void setUserName(String a){
        User.UserName = a;
    }

}
