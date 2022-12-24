package com.hillel.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
       byte byteVariable;


       byteVariable = 90;
        System.out.println(byteVariable);


        byteVariable = 100;
        System.out.println(byteVariable);

short shortVariable = 32000;
int intVariable = 234343243;
long longVariables = 2345354354354323548L; //stavim bykvy L


        float floatVariable = 1.23456789F;  //stavim bykvy F
        double doubleVariable = 1.23456789;
        System.out.println(
                );
        System.out.println(floatVariable);

        System.out.println(doubleVariable);

        char charVariable = 'A';
        char charVariable1 = 65;
        char charVariable2 = '\u0041';   //unicode tale
        char charVariable3 = '\u00B0';   //unicode tale gradys
        char charVariable4 = '\u5143';   //unicode tale
        char charVariable5 = '1';   //esli hotim cifry mozhno tol'ko ot 0-9

        System.out.println(charVariable);
        System.out.println(charVariable1);
        System.out.println(charVariable3);
        System.out.println(charVariable2);
        System.out.println(charVariable4);
        System.out.println("ÖÄÜ");
        System.out.println("Привет");
        System.out.println(charVariable5);


        boolean booleanTrue = true;
        boolean booleanFalse = false;


        System.out.println(booleanTrue);
        System.out.println(booleanFalse);



        String str = "Hello"; // reference tipi dannix
        String str1 = "Hello1"; // reference tipi dannix
        String str2 = "Hello2"; // reference tipi dannix
        String str3 = new String ("Hello3"); // reference tipi dannix

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


// int boolean = 10; nel'zja tak nazivat' kluchevie slova

            byte byte1 = 127;
            short short1 = byte1;

            System.out.println(short1);


            char char1 = 'A';
            int int1 = char1;

        System.out.println(int1);  //esli iz char v int perekladetsja znachenie 65 po unicode


        int int2 = 90;
        double double1 = int2;

        System.out.println(double1);

        byte byteVariable10 = 126;
        long longVariable = byteVariable10;

        System.out.println(longVariable);


        byte byteVariable11 = 126;
        double doubleVariable1 = byteVariable11;

        System.out.println(doubleVariable1);



        //custyvannja

        int x = 10;
        //byte y = x;    // bydet oshibka
        byte y = (byte)x;    // zastavljaem java

        System.out.println(x);
        System.out.println(y);

//voznikaet problema esli previshaet
        int x1 = 129;

        byte y1 = (byte)x1;    // bydet perepolnenie -127 bere chislo s kincja ot -128

        System.out.println(x1);
        System.out.println(y1);


        int a = 65;
            System.out.println((char)a);

            double a2 = 65.0;
            System.out.println((char)a2);

            double a1 = 65.5678768760;
            System.out.println((int)a1);


            //constanti use kluchevoe slovo final


            final double PI =  3.14159265358979323846;//eto znachenie zadaem odin raz , izmenjat' nel'zja. comstatnti vsegda s bol'shoj bykvi
            System.out.println(PI);




    }






}
