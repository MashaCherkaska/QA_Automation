package com.hillel.lessons.lesson10.homework12;

public class Burger {
    String bread;
    String meat;
    String cheese;
    String greens;
    String sauce;


    public Burger(String bread, String meat, String cheese, String greens, String sauce) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.sauce = sauce;

        System.out.println("Original burger with " + this.bread + ", " + this.meat + ", " + this.cheese + ", " + this.greens
                + ", " + this.sauce + " is ready!");
    }

    public Burger(String bread, String meat, String cheese, String greens) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Diet burger with " + this.bread + ", " + this.meat + ", " + this.cheese + ", " + this.greens
                + " is ready!");
    }

    public Burger(String bread, String cheese, String greens) {
        this.bread = bread;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Vegan burger with " + this.bread + ", " + this.cheese + ", " + this.greens + " is ready!");
    }

}



