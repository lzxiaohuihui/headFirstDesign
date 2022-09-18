package com.lee.design1;

public class TestDuck {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.flyBehavior.fly();
        mallardDuck.quackBehavior.quack();

        Duck modelDuck = new ModelDuck();
        modelDuck.flyBehavior.fly();
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.flyBehavior.fly();

    }
}
