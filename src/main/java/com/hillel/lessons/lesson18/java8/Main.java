package com.hillel.lessons.lesson18.java8;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("p2",120d));
        list.add(new Product("p3",88d));
        list.add(new Product("p4",121d));


//        list.stream()
//                .filter(p -> p.getPrice()< 100)
//                .collect(Collectors.toList());
//                        .forEach(System.out::println);






        Collections.sort(list,
                Comparator.comparing(Product ::getName));



        list.forEach(System.out::println);


    }
}
