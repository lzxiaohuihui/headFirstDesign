package com.lee.design3;

public class Coco extends CondimentDecorator{

    public Coco(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.39;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Coco";
    }
    
}
