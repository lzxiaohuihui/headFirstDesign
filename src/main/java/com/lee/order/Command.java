package com.lee.order;

public interface Command {
    public void execute();
    public void undo();
}
