package com.suraj.patterns.factorydesign;

// Concrete Strategies
public class SMSSender implements Notifiable {
    public void send(String user, String msg) {
        System.out.println("SMS to " + user + ": " + msg);
    }
}
