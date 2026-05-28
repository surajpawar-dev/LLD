package com.suraj.patterns.templatePattern;

class Tea extends Beverage {

    @Override
    void addMainIngredient() {
        System.out.println("Adding tea leaves");
    }

    @Override
    void addExtras() {
        System.out.println("Adding sugar and lemon");
    }
}
