package com.hillel.lessons.lesson10.food;

public class Ingredients {

    String bread;
    String meat;
    String cheese;
    String greens;
    String sauce;
    String name;

    void print() {
        System.out.println("Ingredients of your " + name + ": " + bread + ", " + meat + ", " + cheese + ", " + greens +
                ", " + sauce + ".");
    }
}
