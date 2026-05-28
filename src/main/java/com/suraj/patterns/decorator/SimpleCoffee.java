package com.suraj.patterns.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "SimpleCoffee";
    }
}
