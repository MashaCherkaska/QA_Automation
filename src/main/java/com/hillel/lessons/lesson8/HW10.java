package com.hillel.lessons.lesson8;

import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        int n = 0;


        for (int i = 0; i < 1; i++) {


            System.out.print("Enter the number of rows: ");


            while (true) {
                if (scanner.hasNextInt()) {
                    m = scanner.nextInt();

                    scanner.nextLine();
                    break;

                } else {
                    System.out.println("Wrong data! Try again! ");
                    scanner.nextLine();
                }
            }
            System.out.print("Enter the number of columns: ");


            while (true) {
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();

                    scanner.nextLine();
                    break;

                } else {
                    System.out.println("Wrong data! Try again! ");
                    scanner.nextLine();
                }
            }

        }
        int array[][] = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 101);

            }

        }
        System.out.println("The array before transpose: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");

            }

            System.out.println();


        }
        System.out.println("The array after transpose: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[j][i] + "\t");

            }

            System.out.println();


        }


    }
}
