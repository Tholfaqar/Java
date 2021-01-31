package com.codewithDolf;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user1 = new User("Dolf", "Dolf@anymail.com");
        Video video1 = new Video();
        VideoProcessesor videoProcessesor = new VideoProcessesor(
                new VideoEncoder(),
                new VideoDatabase(),
                new Notify());

        video1.setName("honeymoon1.mp4");
        video1.setTitle("our honey moon video in Bahamas");
        video1.setUser(user1);
        videoProcessesor.process(video1);

    }
}
