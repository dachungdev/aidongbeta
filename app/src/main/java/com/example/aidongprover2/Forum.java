package com.example.aidongprover2;

public class Forum {

    public String topic;
    public String userName;
    public String content;
    public String postTime;

    public void setTopic(String topic){
        this.topic = topic;
    }

    public String getTopic(){
        return topic;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setPostTime(String postTime){
        this.postTime = postTime;
    }

    public String getPostTime(){
        return postTime;
    }
}

