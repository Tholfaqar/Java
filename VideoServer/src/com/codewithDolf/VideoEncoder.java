package com.codewithDolf;

public class VideoEncoder implements IVideoEncoder{
    @Override
    public void encode(Video video){
        System.out.println("encoding video");
    }
}
