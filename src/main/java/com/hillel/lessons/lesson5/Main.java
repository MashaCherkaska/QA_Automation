package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 5;
//
//        System.out.println( a > b);
//        System.out.println( a >= b);
//        System.out.println( a < b);
//        System.out.println( a <= b);
//        System.out.println( a == b);
//        System.out.println( a != b);
//
//        boolean isBigger = a > b;
//        System.out.println(isBigger);
//
//        boolean booleanTrue = true;
//
//        System.out.println(!booleanTrue);//inversija kazhe ne te znachennja esli true to false
//
//        System.out.println(!true);



//        if(a > b){
//            System.out.println("a > b");
//        } else {
//            System.out.println("a < b");
//
//        }

//        if (a > b) {
//            System.out.println("a > b");
//        }
//        else if (a < b){
//            System.out.println("a < b");
//        }
//        else {
//            System.out.println("a = b");// a mozhno else if (a == b) sdelat' esch proverku esli nado
//        }
//        }
//        int a = 20;
//        int b = 20;
//        int c = 50;


//
//        if(a < b || b > c){     //abo
//            System.out.println("Hello");
//
//        }
//        if(a < b && b > c){     //and
//            System.out.println("Hello");
//
//        }

//        System.out.println(b > c || a < b);// bydet false ili true

//        System.out.println("a +" +a);

//        if (a >= b){
//            System.out.println("a >= b");
//            if(a > b){  //vkladennij if ne dolzhno bit' bol;she trex yrovney
//                System.out.println("a > b");
//            }else {
//                System.out.println("a = b");
//            }
//
//        }else {
//            System.out.println("a < b");
//
//        }

//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        System.out.println(a > b || b++ == c)//false  b = 3
//        System.out.println("b =" + b);
//
//        System.out.println(a > b && ++b == c);//false && b = 2
//        System.out.println("b =" + b);
//
//        if (a > b){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
//        //ternar ymova ? viraz1 : viraz2  if vikonali ce else vikonali ce
//        System.out.println((a > b) ? "yes" : "NO");
       //SWITCH CASE

//        int a = 3;
//
////
//        switch (a) {           // sho mozhno klasti char, byte,short, int,string
//            case 1: {
//                System.out.println("something 1");
//                break;
//            }
//            case 2: {
//                System.out.println("something 2");
//                break;
//            }
//            case 3: {
//                System.out.println("something 3");
//                break;// obrivaet case i vihodit s switch
//            }
//            case 4: {
//                System.out.println("something 4");
//                break;
//            }
//            default:{
//                System.out.println("do default");// default eto kak else, vkazyut' ostannim ale ne zavzhdi mae byti odin
//           break;// krasch staviti break
//            }
//        }
//
//        String str = "qwerty";
//
//        switch (str) {
//            case "qwer" : {
//                System.out.println("no");
//                break;
//            }
//            case "qwert" : {
//                System.out.println("no1");
//                break;
//            }
//            case "qwerty" : {
//                System.out.println("yes");
//                break;
//            }


            Scanner scanner = new Scanner(System.in);
//
//            int value = scanner.nextInt();
//
//            System.out.println("value =" + value);
//            scanner.nextLine();// chistim bufer pered schitivanija rjadkov (string)
//
//        String next = scanner.nextLine();
//        System.out.println("str =" + next);

        // proverka

        if (scanner.hasNextInt()){
            int value = scanner.nextInt();
            System.out.println("value =" + value);
        } else {
            System.out.println("wrong data! ");
            System.exit( 0);
        }





//String next = scanner.next();// do probelov
//String next = scanner.nextLine();// do konca rjada



        }

    }

