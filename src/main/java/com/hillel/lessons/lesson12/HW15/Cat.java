package com.hillel.lessons.lesson12.HW15;


public class Cat {

    private String name;
    private int age;
    private int weight;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) throws IllegalArgumentException {
        if ("".equals(name) || name == null) {
            throw new IllegalArgumentException("The cat should have the name!");
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age >= 0 && age <= 20) {
            this.age = age;
            System.out.println("The age of cat is " + getAge());
        } else {
            System.out.println("The age of cat should be bigger than 0 and less than 20!");
        }
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
            System.out.println("The weight of cat is " + getWeight());
        } else {

            System.out.println("The weight should be more than 0!");
        }

    }


    public void sayMeow() {
        System.out.println("Meow!");
    }


    public static void main(String[] args) {


        Cat harry = new Cat("", 34, 45);

        harry.setName("Fred");
        System.out.println("New name of cat is " + harry.getName());
        harry.setAge(56);
        harry.setWeight(-2);
        harry.sayMeow();

    }
}
