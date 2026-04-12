package com.suraj.patterns.Observer;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class YoutubeChannel implements Subject {

    private final Set<Observer> observers = new CopyOnWriteArraySet<>();
    private VideoEvent videoEvent;


    @Override
    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            try {
                observer.update(videoEvent);
            } catch (Exception e) {
                System.err.println("Failed to notify observer: " + observer + ", error: " + e.getMessage());
            }
        }
    }

    public void upload(VideoEvent event) {
        this.videoEvent = event;
        notifyObservers();
    }
}