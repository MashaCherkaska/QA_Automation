package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the name of your team:");
        String nameFirstTeam = scanner.nextLine();
        System.out.println("The name of the first team:" + nameFirstTeam);


        System.out.print("Enter the number of frags for gamer 1 in team " + nameFirstTeam + ":");
        double frag1 = 0;
        if (scanner.hasNextDouble()) {
            frag1 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag1);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }


        System.out.print("Enter the number of frags for gamer 2 in team " + nameFirstTeam + ":");
        double frag2 = 0;
        if (scanner.hasNextDouble()) {
            frag2 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag2);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }


        System.out.print("Enter the number of frags for gamer 3 in team " + nameFirstTeam + ":");
        double frag3 = 0;
        if (scanner.hasNextDouble()) {
            frag3 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag3);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }

        System.out.print("Enter the number of frags for gamer 4 in team " + nameFirstTeam + ":");
        double frag4 = 0;
        if (scanner.hasNextDouble()) {
            frag4 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag4);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }

        System.out.print("Enter the number of frags for gamer 5 in team " + nameFirstTeam + ":");
        double frag5 = 0;
        if (scanner.hasNextDouble()) {
            frag5 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag5);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);

        }

        System.out.print("Enter the name of your team:");
        scanner.nextLine();
        String nameSecondTeam = scanner.nextLine();
        System.out.println("The name of the second team:" + nameSecondTeam);


        System.out.print("Enter the number of frags for gamer 1 in team " + nameSecondTeam + ":");
        double frag6 = 0;
        if (scanner.hasNextDouble()) {
            frag6 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag6);
        } else {
            System.out.println("Wrong data! Restart game! ");
            System.exit(0);
        }


        System.out.print("Enter the number of frags for gamer 2 in team " + nameSecondTeam + ":");
        double frag7 = 0;
        if (scanner.hasNextDouble()) {
            frag7 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag7);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }


        System.out.print("Enter the number of frags for gamer 3 in team " + nameSecondTeam + ":");
        double frag8 = 0;
        if (scanner.hasNextDouble()) {
            frag8 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag8);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }

        System.out.print("Enter the number of frags for gamer 4 in team " + nameSecondTeam + ":");
        double frag9 = 0;
        if (scanner.hasNextDouble()) {
            frag9 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag9);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }

        System.out.print("Enter the number of frags for gamer 5 in team " + nameSecondTeam + ":");
        double frag10 = 0;
        if (scanner.hasNextDouble()) {
            frag10 = scanner.nextDouble();
            System.out.println("Value of frags = " + frag10);
        } else {
            System.out.println("Wrong data! Restart game!");
            System.exit(0);
        }

        int count = 5;
        double avgFirstTeam = (frag1 + frag2 + frag3 + frag4 + frag5) / count;
        double avgSecondTeam = (frag6 + frag7 + frag8 + frag9 + frag10) / count;


        if (avgFirstTeam > avgSecondTeam) {
            System.out.println("The winner is " + nameFirstTeam + " with average of frags: " + avgFirstTeam);
        } else {
            System.out.println("The winner is " + nameSecondTeam + " with average of frags: " + avgSecondTeam);
        }
    }
}
