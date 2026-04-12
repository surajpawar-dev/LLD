package com.suraj.patterns.factorydesign;

public class WhatsAppSender implements Notifiable {
    public void send(String user, String msg) {
        System.out.println("WhatsApp to " + user + ": " + msg);
    }
}
