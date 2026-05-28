package com.suraj.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println(coffee.cost());
        System.out.println(coffee.description());
    }
}
