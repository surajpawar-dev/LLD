package com.suraj.patterns.proxyPattern;

public class Client {
    public static void main(String[] args) {
        ServiceInterface serviceInterface = new ServiceProxy();
        serviceInterface.operation();
    }
}
