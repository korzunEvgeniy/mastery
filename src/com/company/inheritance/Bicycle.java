package com.company.inheritance;

public class Bicycle extends Cycle{
    private final int wheel = 2;
    @Override
    public void ride(){
        System.out.println(Bicycle.this + " ride on " + wheels() + " wheel");
    }

    @Override
    public int wheels() {
        return wheel;
    }

    public int getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Bicycle";
    }
}
