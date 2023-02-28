package com.hillel.lessons.lesson17.HW17.product;

import java.util.*;

public class ProductMarket {

    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }


    public List<Double> getPrices1() {
        List<Double> prices = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() >= 10) {
                prices.add(p.getPrice());
            }

        }
        return prices;
    }

    public List<Double> getPrices2() {
        List<Double> prices = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() <= 5) {
                prices.add(p.getPrice());
            }
        }
        return prices;
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (Product p1 : products) {
            names.add(p1.getName());
        }
        return names;
    }

    public List<String> getNames1() {
        List<String> names = new ArrayList<>();
        for (Product p2 : products) {
            names.add(p2.getName());
        }
        Collections.sort(names);
        return names;
    }

    public List<Double> getPriceToString() {
        List<Double> prices = new ArrayList<>();
        for (Product p3 : products) {
            prices.add(p3.getPrice());
            Double.toString(p3.getPrice());

        }
        return prices;
    }

}
