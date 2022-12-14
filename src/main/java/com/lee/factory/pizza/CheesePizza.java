package com.lee.factory.pizza;

import com.lee.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);   
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
    
}
