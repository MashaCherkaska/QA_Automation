package com.hillel.lessons.lesson6;

public class HW8 {
    public static void main(String[] args) {

        int counter = 0;


        for (int i = 1; true; i++) {

            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 % 10 == 4 || i / 10 % 10 == 9) {

                continue;
            }

            System.out.println(i);
            counter++;
            if (counter >= 100) {
                break;
            }
        }
        System.out.println("Number of shuttles = " + counter);


    }
}
