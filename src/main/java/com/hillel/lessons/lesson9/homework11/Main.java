package com.hillel.lessons.lesson9.homework11;

public class Main {
    public static void main(String[] args) {


        Person person = new Person();

        person.name = "John";
        person.surname = "Smith";
        person.city = "Chicago";
        person.phone = 1234567;

        Person person1 = new Person();

        person1.name = "Alex";
        person1.surname = "Black";
        person1.city = "New York";
        person1.phone = 77777777;

        Person person2 = new Person();

        person2.name = "Sam";
        person2.surname = "Cross";
        person2.city = "Vegas";
        person2.phone = 98765424;

        Person.personInfo(person.name, person.surname, person.city, person.phone);
        Person.personInfo(person1.name, person1.surname, person1.city, person1.phone);
        Person.personInfo(person2.name, person2.surname, person2.city, person2.phone);

    }
}
