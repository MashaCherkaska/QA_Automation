package com.hillel.lessons.lesson18.java8.HW18.products;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket1 {

    private List<Product> products;

    public ProductMarket1(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getProductPriceLess5(){
    return products.stream()
                .filter(p -> p.getPrice() <= 5)
                .collect(Collectors.toList());
}

    public List<Product> getProductPriceMore10(){
        return products.stream()
                .filter(p -> p.getPrice() >= 10)
                .collect(Collectors.toList());
    }

    public List<String> getProductNames1(){
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

    }
    public List<String> getProductAlphaBetNames(){
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());

    }

    public List<String> getProductPriceToStr(){
        return products.stream()
                .map(Product::toString)
                .collect(Collectors.toList());
    }

}
