package com.suraj.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 =  Singleton.getInstance();
        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);
        String ans = (s1 == s2) ? "True" : "False";
        System.out.println(ans);

    }
}
