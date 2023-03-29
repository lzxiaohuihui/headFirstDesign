package com.lee.state;

public class SoldOutState implements State {
    private static final long serialVersionUID = 2L;

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
