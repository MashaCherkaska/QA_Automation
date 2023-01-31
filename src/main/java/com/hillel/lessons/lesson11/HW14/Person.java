package com.hillel.lessons.lesson11.HW14;

public class Person {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String mail;
    private final int phone;

    String surname;
    int weight;
    int pressure;
    int steps;


    public Person(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                  String mail, int phone, String surname, int weight, int pressure, int steps) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.mail = mail;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;


    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public String getMail() {
        return mail;
    }

    public int getPhone() {
        return phone;
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
            System.out.println("The weight is changed to " + getWeight());
        } else {

            System.out.println("The weight should be more than 0!");
        }

    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        if (steps < 50000) {
            this.steps = steps;
            System.out.println("The quantity of steps is changed to " + getSteps());
        } else {

            System.out.println("It can't be true !");
        }

    }



    public void printAccountInfo() {
        int age = 2023 - getYearOfBirth();
        System.out.println("Account info of user: ");
        System.out.println("Name " + getName() + " Surname " + surname + ". "+ "Date of birth " + getDayOfBirth() + "." + getMonthOfBirth()
                + "." + getYearOfBirth() + " Age is " + age + ". " + "E-mail:" + getMail() + " Phone number:"
                + getPhone() + " weight:" + getWeight() + " pressure:" + pressure + " steps:" + getSteps());


    }


}