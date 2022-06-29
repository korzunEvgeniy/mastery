package com.company;

import com.company.inheritance.Animal;
import com.company.inheritance.Bicycle;
import com.company.inheritance.Cat;
import com.company.inheritance.Cycle;
import com.company.inheritance.Feline;
import com.company.inheritance.Tricycle;
import com.company.inheritance.Unicycle;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Lucky", 4, "Gray", "male");
        cat.voice();
        Animal feline = new Feline("Lucky", 4, "Gray");
        feline.voice();

        feline.animal();
        cat.animal();

        Animal.count();
        Feline.count();
        Cat.count();



//        Cycle unicycle = new Unicycle();
//        Cycle bicycle = new Bicycle();
//        Cycle tricycle = new Tricycle();
//
//        unicycle.ride();
//        bicycle.ride();
//        tricycle.ride();

//        ride(unicycle);
//        ride(bicycle);
//        ride(tricycle);
    }

    public static void ride(Cycle c) {
        System.out.println(c + " ride on " + c.getWheel());
    }
}
