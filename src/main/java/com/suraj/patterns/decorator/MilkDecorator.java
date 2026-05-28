package com.suraj.patterns.decorator;

public class MilkDecorator extends CoffeeDecorator {

    protected MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 10;
    }

    @Override
    public String description() {
        return coffee.description() + " | " + "Milk";
    }
}
