package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest getOrderGluten () {
        HashMap<Product, Integer> products = new HashMap<>();

        products.put(new Product("tomato"), 8);
        products.put(new Product("banana"), 5);


        User user = new User("Lukas", "Bean", "Wolska 5",  "123456789");

        return new OrderRequest(new GlutenFreeShop(), products, user);
    }

    public OrderRequest getOrderHealthy () {

        HashMap<Product, Integer> products = new HashMap<>();


        products.put(new Product("chia seeds"), 100);
        products.put(new Product("coconut oil"), 2);

        User user = new User("Tom", "Friday", "Ametystowa 24/3","987654321");

        return new OrderRequest(new HealthyShop(), products, user);
    }
}
