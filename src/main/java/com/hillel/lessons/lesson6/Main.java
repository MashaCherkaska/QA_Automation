package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //FOR blok inicializacii iteratora(schetchik)(vsegda pervij i odin raz); blok ymovi vihody z ciklu ili sravnenie ili boolean(esli true -> to v telo cikla popadaem{});blok zminu iteratora

//      for(int i=0; i < 5 ; i++) {
//          System.out.println("Hello");


//    }
//        for(int i=5; true ; i+=5) {
//            System.out.println(i);
//        }beskonechniy bydet cikl
//        int = i;
//        for(; i < 5 ; i++) {
//            System.out.println("Hello");}bez pervogo bloka
//
//        for(int i=0; i < 5 ;) {
//            System.out.println("Hello");}
//        bez tret'ego bloka bydet beskonechnij cikl

//       int i = 1;
//
//       for( ; ; ){
//           System.out.println("Hello");
//       }tozhe beskonechnij

//        int i = 1;
//
//      for( ; ; ){
//          System.out.println("Hello");
//      }

       //break
//

        //CONTINUE
//schitaem ot 1 do 10 bez 5 i 7
//        int i = 0;
//
//        for( ; ; )
//        {
//           if (i == 10){
//           break;}
//
//            i++;
//
//           if(i==5 || i ==7){
//               continue;
//           }
//
//        System.out.println(i);
//
//        }
//
//        for(int i = 1; i <= 10; i++){
//            if(i ==5 || i==7){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        for(int i = 0; i <= 20; i += 2){
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 20; i += 2){
//            if(i % 2 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }

//
//        int num1 = 0;
//        int num2 = 1;
//        int sum = -1;
//        System.out.println(num1 + num2);
//
//        for(int i = 0; i <9; i++){
//            sum = num1 + num2;
//            System.out.println(sum);
//
//            num1 = num2;
//            num2 = sum;
//        } fibonachi

        //WHILE
        // blok ymovi iz vihoda cikla
//        int i =0;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//
//        }

//        while(true) beskonechnij cikl

        //DO WHILE spochatky zrobit' potom proveril, a while snachala dymaet, a potom delaet

//        int i = 20;
//        do{
//            System.out.println(i);
//            i++;
//        } while (i < 30);

        Scanner scanner = new Scanner(System.in);
         int userValue = -1;

//         while(true) {
//             System.out.println("Please enter integer");
//             if (scanner.hasNextInt()) {
//                 userValue = scanner.nextInt();
//                 System.out.println("user value" + userValue);
//                 break;
//
//             }else {
//                 System.out.println("wrong data");
//                 scanner.nextLine();
//             }
//
//         }vmesto system exit




}
}
