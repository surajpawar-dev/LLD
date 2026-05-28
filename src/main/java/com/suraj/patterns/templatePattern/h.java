package com.suraj.patterns.templatePattern;

class Coffee extends Beverage {

    @Override
    void addMainIngredient() {
        System.out.println("Adding coffee powder");
    }

    @Override
    void addExtras() {
        System.out.println("Adding milk and sugar");
    }
}