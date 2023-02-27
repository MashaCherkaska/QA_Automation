package com.hillel.lessons.lesson17.HW17.main;

import com.hillel.lessons.lesson17.HW17.product.Product;
import com.hillel.lessons.lesson17.HW17.product.ProductMarket;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product("Tequila", 4.6));
        list.add(new Product("Vodka", 3.6));
        list.add(new Product("Gin", 10.3));


        Collections.sort(list,
                Comparator.comparing(Product::getName));
        list.forEach(System.out::println);


        ProductMarket productMarket = new ProductMarket(list);
        System.out.println(productMarket.getNames());
        System.out.println(productMarket.getPrices());
        System.out.println(productMarket.getPriceString());


    }
}
