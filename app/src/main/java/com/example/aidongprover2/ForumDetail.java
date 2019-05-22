package com.example.aidongprover2;

public class ForumDetail {

    private String userName = "";
    private String floorId = "";
    private String detailContent = "";
    private String startTime = "";

    public void setUserName(String a){
        this.userName = a;
    }

    public String getUserName(){
        return userName;
    }

    public void setFloorId(String a) {
        this.floorId = a;
    }

    public String getFloorId(){
        return floorId;
    }

    public void setDetailContent(String a){
        this.detailContent = a;
    }

    public String getDetailContent(){
        return detailContent;
    }

    public void setStartTime(String a){
        this.startTime = a;
    }

    public String getStartTime(){
        return startTime;
    }
}
