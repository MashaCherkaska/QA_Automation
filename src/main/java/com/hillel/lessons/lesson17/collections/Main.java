package com.hillel.lessons.lesson17.collections;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {



    }

    public static void getException() throws IOException {
        throw new IOException();
    }
    public static int getNumber(){

        try {
            System.out.println("1");       // kak tol'ko v try = exception dalshe system idet v block catch
            getException();
            return 1;
        } catch(IOException e){
            return 2;
        } finally {
            return 5; // finally imeet prioritet nad return

        }
    }
}
