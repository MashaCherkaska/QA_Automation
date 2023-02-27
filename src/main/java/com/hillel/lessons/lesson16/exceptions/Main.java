package com.hillel.lessons.lesson16.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        //handlit' exception
        //try catch

        //blok try pomeschaetsja opasnij kod

//        try{
//        int x = 10 / 0;
//        } catch (ArithmeticException e) {
//
//            System.out.println("Exception ");
//
//        } finally {
//           // int y = 10/0; //eto exception i finally ne vipolnitsja
//            //System.exit(500); finally ne vipolnitsja
//
//        System.out.println("Block finally");}
//
//        System.out.println("Application is still running");

        //Multi catch blok

//        try{
//            int x = 10 / 0;
//        } catch (ArithmeticException e) {
//
//            System.out.println("Exception ");
//
//        } catch (IllegalArgumentException e) {
//
//            System.out.println("Exception ");
//
//        } catch (RuntimeException e){
//
//            System.out.println("Exception 2");
//
//        } catch (Exception e){
//
//            System.out.println("Exception 3");
//        }
//        System.out.println();


        //catch dolzhen bit' v porjadke vozrastanija ot naslednika k parent
        //try -  finally mozhet bit'


//        public static IOException getException() throws IOException {
//            throw new IOException();
//        }
//


//         public static int getIOException() throws ArithmeticException{
//    int x = 20/0;
//    return x;
//
//        }


//        public static String logIn(String logIn, String parol){
//            if (logIn != null)
//            return "logIn is success ";
//        } else throw new IOException("Login is wrong ");


        //kak sozdat' exception

    }
}
