package com.suraj.patterns.proxyPattern;

public class ServiceProxy implements ServiceInterface{
    Service service;

    @Override
    public void operation() {
        if(service == null){
            service = new Service();
        }
        System.out.println("Calling service from proxy");
        service.operation();
    }
}
