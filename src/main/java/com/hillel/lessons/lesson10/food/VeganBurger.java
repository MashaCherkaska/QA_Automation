package com.hillel.lessons.lesson10.food;


public class VeganBurger extends Ingredients {


    @Override
    void print() {
        System.out.println("Ingredients of your " + name + ": " + bread + ", " + cheese + ", " + greens + ", " + sauce + ".");
    }


}

