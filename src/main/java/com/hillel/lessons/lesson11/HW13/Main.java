package com.hillel.lessons.lesson11.HW13;

public class Main {
    public static void main(String[] args) {

        Androids Androids = new Androids("Samsung");
        Androids.call();
        Androids.sms();
        Androids.internet();
        Androids.platform();

        System.out.println();
        System.out.println();

        IPhones IPhones = new IPhones("13");
        IPhones.call();
        IPhones.sms();
        IPhones.internet();
        IPhones.platform();


    }
}
