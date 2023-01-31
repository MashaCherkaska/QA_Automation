package com.hillel.lessons.lesson11.HW14;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 10, 10, 1990, "john@gmail.com", 123456,
                "Black", 90, 125, 23000);

        person1.printAccountInfo();


        Person person2 = new Person("Fred",1,3,1995, "fred@gmail.com", 654321,
                "Brown", 80, 120, 11000);


        person2.printAccountInfo();
        person2.setWeight(90);
        person2.setSteps(50000);

        Person person3 = new Person("July", 23, 10, 1963, "july@gmail.com", 7894564, "Red", 58, 90, 9800);
        person3.printAccountInfo();
        person2.setWeight(100);
        person2.setSteps(9000);

    }
}
