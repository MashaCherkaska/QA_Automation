package com.hillel.lessons.lesson17.HW17.product;

import java.util.*;

public class ProductMarket {

    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }


    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() >= 10) {
                names.add(p.getName());
            }

        }

        Collections.sort(names);
        return names;
    }

    public List<String> getPrices() {
        List<String> names = new ArrayList<>();
        for (Product p1 : products) {
            if (p1.getPrice() <= 5) {
                names.add(p1.getName());
            }

        }
        Collections.sort(names);
        return names;
    }

    public Map<String, String> getPriceString() {
        Map<String, String> productWithPrice = new HashMap<>();

        for (Product product : products) {
            productWithPrice.put(product.getName(), product.getPrice().toString());

        }

        return productWithPrice;
    }


}
