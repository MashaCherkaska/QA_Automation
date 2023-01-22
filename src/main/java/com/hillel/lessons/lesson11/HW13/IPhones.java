package com.hillel.lessons.lesson11.HW13;

public class IPhones implements Smartphones, IOS {

    String model;

    public IPhones(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("iPhone " + model + " calls.");
    }

    @Override
    public void sms() {
        System.out.println("iPhone " + model + " sends sms.");

    }

    @Override
    public void internet() {
        System.out.println("iPhone " + model + " has internet.");

    }

    @Override
    public void platform() {
        System.out.println("iPhone " + model + " has IOS.");

    }
}
