package com.suraj.patterns.factorydesign;

// Client
public class AppRunner {
    public static void main(String[] args) {

        NotificationContext ctx1 = new NotificationContext(NotificationFactory.getBean("email"));
        ctx1.send("Suraj", "Kya kr rha hai bhai");

        System.out.println("----------------------------");

        NotificationContext ctx2 = new NotificationContext(NotificationFactory.getBean("whatsapp"));
        ctx2.send("Suraj", "Kya kr rha hai bhai");
    }
}