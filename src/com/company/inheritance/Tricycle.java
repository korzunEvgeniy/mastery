package com.company.inheritance;

public class Tricycle extends Cycle{
    private final int wheel = 3;
    @Override
    public void ride(){
        System.out.println(Tricycle.this + " ride on " + wheels() + " wheel");
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
        return "Tricycle";
    }
}
