package com.company.inheritance;

public class Unicycle extends Cycle{
    private final int wheel = 1;
    @Override
    public void ride(){
        System.out.println(Unicycle.this + " ride on " + wheels() + " wheel");
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
        return "Unicycle";
    }
}
