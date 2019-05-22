package com.example.aidongprover2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityData {

    private static int activityData = 1;

    private static int activityId = 1;

    private static int aboutForum = 0;

    private static int loOrRe = 0;

    private static int shop = 0;

    private static int reflash = 0;

    public static void setActivityData(int a){
        ActivityData.activityData = a;
    }

    public static int getActivityData(){
        return activityData;
    }

    public static void setActivityId(int a){
        ActivityData.activityId = a;
    }

    public static int getActivityId(){
        return activityId;
    }

    public static void setLoOrRe(int a){
        ActivityData.loOrRe = a;
    }

    public static int getLoOrRe(){
        return loOrRe;
    }

    public static String getSystemTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dataTime = new Date(System.currentTimeMillis());
        String resTime = simpleDateFormat.format(dataTime);
        return resTime;
    }

    public static void setShop(int a){
        ActivityData.shop = a;
    }

    public static int getShop(){
        return shop;
    }

    public static void setReflash(int a){
        ActivityData.reflash = a;
    }

    public static int getReflash(){
        return reflash;
    }

    public static void setAboutForum(int a){
        ActivityData.aboutForum = a;
    }

    public static int getAboutForum(){
        return aboutForum;
    }
}
