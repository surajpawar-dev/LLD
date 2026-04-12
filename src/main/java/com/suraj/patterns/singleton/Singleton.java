package com.suraj.patterns.singleton;

public class Singleton {
    private static volatile Singleton singleton; // volatile is important!

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {                    // 1st check — no lock
            synchronized(Singleton.class) {
                if (singleton == null) {            // 2nd check — with lock
                    singleton = new Singleton();
                }
            }
        }
        return singleton; // No lock acquired after instance exists
    }
}