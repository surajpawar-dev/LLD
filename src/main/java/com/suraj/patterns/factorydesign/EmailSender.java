package com.suraj.patterns.factorydesign;

public class EmailSender implements Notifiable {
    public void send(String user, String msg) {
        System.out.println("Email to " + user + ": " + msg);
    }
}
