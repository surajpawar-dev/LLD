package com.suraj.patterns.Observer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Observer suraj = new Subscriber("Suraj");
        Observer anjali = new Subscriber("Anjali");

        YoutubeChannel channel = new YoutubeChannel();
        channel.addObserver(suraj);
        channel.addObserver(anjali);
        channel.upload(new VideoEvent("Observer Pattern", LocalDateTime.now()));
        channel.upload(new VideoEvent("Singleton Pattern", LocalDateTime.now()));

        System.out.println("--------Anjali Unsubscribe---------");
        channel.removeObserver(anjali);
        channel.upload(new VideoEvent("Factory Pattern", LocalDateTime.now()));
    }
}
