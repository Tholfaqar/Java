package com.codewithDolf;

public class Video {
    private String name;
    private String title;
    private User user;

    public void setName(String name){
        this.name = name;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setUser(User user){
        this.user = user;
    }
    public String getName(){
        return this.name;
    }
    public String getTitle(){
        return this.title;
    }
    public User getUser(){
        return this.user;
    }
}
