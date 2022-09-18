package com.lee.design1;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silence...");
    }
}
