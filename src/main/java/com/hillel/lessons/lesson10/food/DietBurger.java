package com.hillel.lessons.lesson10.food;

public class DietBurger extends Ingredients{

String drink;

String snack;

void additionalOption() {

    System.out.println("Set to diet burger " + drink + " & " + snack + ".");
}

    @Override
    void print() {
        System.out.println("Ingredients of your " + name + ": " + bread + ", "+ meat + ", " + cheese + ", " + greens + ".");
    }
}
