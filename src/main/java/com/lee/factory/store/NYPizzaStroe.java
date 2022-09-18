package com.lee.factory.store;

import com.lee.factory.NYPizzaIngredientFactory;
import com.lee.factory.PizzaIngredientFactory;
import com.lee.factory.pizza.CheesePizza;
import com.lee.factory.pizza.ClamPizza;
import com.lee.factory.pizza.Pizza;

public class NYPizzaStroe extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if("clams".equals(type)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clams Pizza");
        }

        return pizza;
    }
    
}
