package com.suraj.patterns.factorydesign;

// Context
public class NotificationContext {
    private final Notifiable notifiable;

    public NotificationContext(Notifiable notifiable) {
        this.notifiable = notifiable;
    }

    public void send(String user, String msg) {
        notifiable.send(user, msg);
    }
}