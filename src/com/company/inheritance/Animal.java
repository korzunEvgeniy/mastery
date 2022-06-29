package com.company.inheritance;

public abstract class Animal {
    String name;
    int foot;

    public Animal() {}
    public Animal(String name, int foot) {
        this.name = name;
        this.foot = foot;
        System.out.println("Initialization Animal constructor");
    }

    public void voice() {
        System.out.println("This is my voice");
        say();
    }

    public void say() {
        System.out.println("Say-Say");
    }

    public Animal animal() {
        return null;
    }

    public static void count() {
        System.out.println("1");;
    }
}