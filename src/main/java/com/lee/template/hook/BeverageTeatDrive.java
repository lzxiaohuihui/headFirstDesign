package com.lee.template.hook;

public class BeverageTeatDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
