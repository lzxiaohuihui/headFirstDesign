package com.lee.factory.pizza;

import java.util.Arrays;

import com.lee.factory.material.Cheese;
import com.lee.factory.material.Clams;
import com.lee.factory.material.Dough;
import com.lee.factory.material.Pepperoni;
import com.lee.factory.material.Sauce;
import com.lee.factory.material.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;


    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Place pizza in official PizzaStroe box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza [cheese=" + cheese + ", clams=" + clams + ", dough=" + dough + ", name=" + name + ", pepperoni="
                + pepperoni + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies) + "]";
    }

    
}
