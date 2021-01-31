package com.codewithDolf;

public class VideoDatabase implements IVideoDatabase{
    @Override
    public void store(Video video){
        System.out.println("processing video");
    }
}
