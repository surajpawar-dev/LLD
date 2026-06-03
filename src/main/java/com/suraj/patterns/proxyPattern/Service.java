package com.suraj.patterns.proxyPattern;

public class Service implements ServiceInterface
{
    @Override
    public void operation() {
        System.out.println("This is service class");
    }
}
