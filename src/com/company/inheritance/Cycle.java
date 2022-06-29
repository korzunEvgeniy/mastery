package com.company.inheritance;

public class Cycle {
    private int wheel = 1;
    public void ride(){
        System.out.println("I can ride");
    }

    public int wheels() {
        return 0;
    }

    public int getWheel() {
        return wheel;
    }
}
