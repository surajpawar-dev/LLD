package com.suraj.patterns.factorydesign;


// Factory
public class NotificationFactory {
    public static Notifiable getBean(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL" -> {
                return new EmailSender();
            }
            case "SMS" -> {
                return new SMSSender();
            }
            case "WHATSAPP" -> {
                return new WhatsAppSender();
            }
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}