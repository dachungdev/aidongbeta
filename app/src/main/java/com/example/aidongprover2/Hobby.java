package com.example.aidongprover2;

public class Hobby {

    private String hobbyId;

    private int imageId;


    public Hobby(String hobbyId,int imageId){
        this.hobbyId = hobbyId;
        this.imageId = imageId;
    }

    public String getHobbyId(){
        return hobbyId;
    }

    public int getImageId(){
        return imageId;
    }

}
