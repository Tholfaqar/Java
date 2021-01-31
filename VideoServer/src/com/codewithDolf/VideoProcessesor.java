package com.codewithDolf;

public class VideoProcessesor {
    private String name;
    private String title;


    private IVideoEncoder videoEncoder;
    private IVideoDatabase videoDatabase;
    private INotify notify;

    public VideoProcessesor(IVideoEncoder videoEncoder, IVideoDatabase videoDatabase, INotify notify){
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.notify = notify;
    }

    public void process(Video video){
        videoEncoder.encode(video);
        videoDatabase.store(video);
        notify.send(video);
    }

}
