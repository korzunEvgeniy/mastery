package com.company.inheritance;

public class Cat extends Feline {
    String gender;

    public Cat() {}
    public Cat(String name, int foot, String color, String gender) {
        super(name, foot, color);
        this.gender = gender;
        System.out.println("Initialization Cat constructor");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow!");
    }

    @Override
    public Cat animal() {
        System.out.println("Create new Cat");
        return new Cat();
    }

    public static void count() {
        System.out.println("3");;
    }
}