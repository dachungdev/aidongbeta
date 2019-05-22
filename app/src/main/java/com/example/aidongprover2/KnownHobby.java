package com.example.aidongprover2;

public class KnownHobby {

    private static String Hobby = "未知";

    public static void sethobby(String a){
        KnownHobby.Hobby = a;
    }

    public static String getHobby(){
        return Hobby;
    }
}
