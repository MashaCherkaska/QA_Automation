package com.hillel.lessons.lesson18.java8.HW18.Main;



import com.hillel.lessons.lesson18.java8.HW18.products.Product;
import com.hillel.lessons.lesson18.java8.HW18.products.ProductMarket1;

import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tequila", 4.6));
        list.add(new Product("Vodka", 3.6));
        list.add(new Product("Gin", 10.3));
        list.add(new Product("Zubrovka", 10.0));

        ProductMarket1 productMarket1 = new ProductMarket1(list);
        productMarket1.getProductNames1().forEach(System.out::println);
        System.out.println(productMarket1.getProductPriceLess5());
        System.out.println(productMarket1.getProductPriceMore10());
        productMarket1.getProductAlphaBetNames().forEach(System.out::println);
        productMarket1.getProductPriceToStr().forEach(System.out::println);


    }
}
