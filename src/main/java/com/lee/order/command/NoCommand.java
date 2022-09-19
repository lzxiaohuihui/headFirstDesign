package com.lee.order.command;

import com.lee.order.Command;

public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Nothing...");
    }

    @Override
    public void undo() {
        System.out.println("Nothing...");
        
    }
    

}
