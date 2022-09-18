package com.lee.factory.store;

import com.lee.factory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
