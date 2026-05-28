package com.suraj.patterns.decorator;

public class SugarDecorator extends CoffeeDecorator {

    protected SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost() + 20;
    }

    @Override
    public String description() {
        return coffee.description() + " | " + "Sugar";
    }
}
