package com.hillel.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;
//
//      /*  System.out.println(5 + 10);
//
//       */
//
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b); //delenie
//
//        System.out.println((int) 10.4444444);
//
//
//        System.out.println(10.0 / 3); //delenie s ostatkom hardcode
//        System.out.println((double)a / b); //robimo cust
//        System.out.println(a / (double) b); //robimo cust
//        System.out.println((double)a /(double) b); //robimo cust
//
//        //zalishok vid dilennja
//        System.out.println(a % b); // 3 * 3 = 9 10-9=1 i ostatok 1
//        System.out.println(10 % 2);
//        System.out.println(10 % 4);//2
//        System.out.println(10 % 6);//4
//        System.out.println(10 % 7);//3
//
//        //skorocheni operatori
//
////        int c = 10;
////        int d = 3;
////        c = c + 5;
//
//        a += 5;
//        a += 5 + 10 * 2;
//        System.out.println(a);
//        a -= 5 + 10 * 2;
//        System.out.println(a);
//        a *= 5 + 10 * 2;
//        System.out.println(a);
//        a /= 5 + 10 * 2;
//        a %= 5 + 10 * 2;
//
//        //nadavannja prioritety
//
//        System.out.println(a + b * a -b);
//        System.out.println((a + b) * a -b);
//        System.out.println(a + b * (a -b));
//
////increment and decrement
//        int c = 10;
//        int d = 3;
//
//
//        System.out.println((int)10.7);
//        System.out.println(Math.round(10.7));//11 okryglenie
//        System.out.println(Math.round(10.4));//10 okrygljaet v zavisimoati ot posle zapjatoj
//
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//
//        System.out.println(Math.max(10, 11));// sravivaet dva zisla i beret bolshee
//
////        int max = Math.max(20,22);
////        System.out.println(max);
//
//        System.out.println(Math.min(33, 20));//naxodit minimal'noe
//
//        System.out.println(Math.sqrt(16));//koren' kvadratniy
//        System.out.println(Math.sqrt(23.99));//koren' kvadratniy tipa double
//
//        System.out.println(Math.pow(3, 2));//stepen' pervoe kakoe chislo, vtoroe v kakyu stepen'
//
//        System.out.println(Math.random());//povertae random chislo ot 0.0 do 0.9999999
//        System.out.println(Math.random() * 11);//povertae random chislo ot 0.0 do 0.9999999
//        System.out.println((int)(Math.random() * 11));//povertae random chislo ot 0 do 10
//        System.out.println((int)(Math.random() * 11));//povertae random chislo ot 0 do 10
//        System.out.println(15 + (int)(Math.random() * 16));//povertae random chislo ot 15 do 30
//        System.out.println(min + (int)(Math.random() * 16));//povertae random chislo ot 15 do 30
//
//       int min = 15;
//       int max = 30;
//        System.out.println((int)(Math.random() * (max - min 1+)) + min);//povertae random chislo ot 15 do 30
//
//
//
////        System.out.println(Math.PI);
////        System.out.println(Math.E);
////        System.out.println(Math.E + 10);
//
//
//
//        //        System.out.println(c++ + d++ - c--);//10+3-11
////        System.out.println();
//       // c = c + 1;
//        //c += 1;
////        c++; //increement
////        System.out.println(c);
////        c--; //decrement
////        System.out.println(c);
////
////        System.out.println(10 + a++);
////
////        System.out.println("after a " + a++);
//
//
//    }

        int a = 500;
        int b = 1500;
        int c = 3500;

        int years = 10 * 12;

        int employee1Salary10years = a * years ;
        int employee2Salary10years = b * years;
        int employee3Salary10years = c * years;
        System.out.println(employee1Salary10years);
        System.out.println(employee2Salary10years);
        System.out.println(employee3Salary10years);

        double employee1Salary10yearsWithoutTax = employee1Salary10years * 0.95 ;
        double employee2Salary10yearsWithoutTax = employee2Salary10years * 0.95 ;
        double employee3Salary10yearsWithoutTax = employee3Salary10years * 0.95 ;

        System.out.println(employee1Salary10yearsWithoutTax);
        System.out.println(employee2Salary10yearsWithoutTax);
        System.out.println(employee3Salary10yearsWithoutTax);

        double avgWithTax = (employee2Salary10years + employee2Salary10yearsWithoutTax + employee3Salary10yearsWithoutTax) / 3.0;
        System.out.println(avgWithTax);


    }
}
