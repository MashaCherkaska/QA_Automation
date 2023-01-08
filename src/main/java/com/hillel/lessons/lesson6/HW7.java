package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int computerRandomNumber = (int) (Math.random() * 11);
        System.out.println(computerRandomNumber);


        for (int i = 0; i < 3; i++) {

            int guess = 0;

            System.out.print("Guess the number from 0 to 10 that I guessed! Let's go! ");
            System.out.print("Attempt " + (i + 1) + ":" );

            while (true) {
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Wrong data! Try again! ");
                    scanner.nextLine();
                }

            }

            if (guess < computerRandomNumber) {
                System.out.println("The number is less than I guessed!");

            } else if (guess > computerRandomNumber) {
                System.out.println("The number is more than I guessed!");
            } else {
                System.out.println("Great! You guess!");
                break;
            }

            if(i == 2 && guess != computerRandomNumber ){
                System.out.println("Try next time!");
            }
        }
    }
}
