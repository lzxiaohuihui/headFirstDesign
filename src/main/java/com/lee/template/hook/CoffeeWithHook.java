package com.lee.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (Y/n)?");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer= bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (answer== null){
            return "no";
        }
        return answer;
    }
}
