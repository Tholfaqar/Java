package com.codewithDolf;

public class Notify implements INotify{
    @Override
    public void send(Video video){
        System.out.println("sending message to the user");
    }
}
