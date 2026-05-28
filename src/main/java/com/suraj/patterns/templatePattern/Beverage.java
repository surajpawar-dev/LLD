package com.suraj.patterns.templatePattern;

abstract class Beverage {

    // Template Method
    public final void prepareDrink() {
        boilWater();
        addMainIngredient();
        pourInCup();
        addExtras();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Steps that subclasses will customize
    abstract void addMainIngredient();

    abstract void addExtras();
}