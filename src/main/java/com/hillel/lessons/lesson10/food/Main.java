package com.hillel.lessons.lesson10.food;

public class Main {

    public static void main(String[] args) {

        DietBurger dietBurger = new DietBurger();
        dietBurger.name = "diet Burger";
        dietBurger.bread = "rye bun";
        dietBurger.meat = "lamb";
        dietBurger.cheese = "gouda";
        dietBurger.greens = "lettuce";
        dietBurger.drink = "Zero Cola";
        dietBurger.snack = "french fries";

        dietBurger.print();
        dietBurger.additionalOption();

        System.out.println();
        System.out.println();

        OriginalBurger originalBurger = new OriginalBurger();
        originalBurger.name = "original Burger";
        originalBurger.bread = "white bun";
        originalBurger.meat = "beef";
        originalBurger.cheese = "cheddar";
        originalBurger.greens = "drill";
        originalBurger.sauce = "mayo";

        originalBurger.print();

        System.out.println();
        System.out.println();

        VeganBurger veganBurger = new VeganBurger();
        veganBurger.name = "vegan Burger";
        veganBurger.bread = "white bun";
        veganBurger.cheese = "cheddar";
        veganBurger.greens = "tomato";
        veganBurger.sauce = "vegan mayo";

        veganBurger.print();




    }
}
