package com.hillel.lessons.lesson11.HW13;

public class Androids implements Smartphones, LinuxOS {

    String model;

    public Androids(String model) {
        this.model = model;
    }

    @Override
    public void call() {
        System.out.println("Android " + model + " calls.");

    }

    @Override
    public void sms() {
        System.out.println("Android " + model + " sends sms.");

    }

    @Override
    public void internet() {
        System.out.println("Android " + model + " has internet.");

    }

    @Override
    public void platform() {
        System.out.println("Android " + model + " has LinuxOS.");

    }
}
