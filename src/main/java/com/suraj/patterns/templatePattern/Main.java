package com.suraj.patterns.templatePattern;

public class Main {
    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepareDrink();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareDrink();
    }
}
