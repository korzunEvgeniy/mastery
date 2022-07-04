package com.company.inheritance;

public class Feline extends Animal {
    String color;

    public Feline() {}

    public Feline(String name, int foot, String color) {
        super(name, foot);
        this.color = color;
        System.out.println("Initialization Feline constructor");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("My voice!");
    }

    @Override
    public void say() {
        System.out.println("Ror");
    }

    @Override
    public Animal animal() {
        System.out.println("Create new Feline");
        return new Feline();
    }

    public static void count() {
        System.out.println("2");;
    }

    @Override
    public String toString() {
        return "Feline{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", foot=" + foot +
                '}';
    }
}