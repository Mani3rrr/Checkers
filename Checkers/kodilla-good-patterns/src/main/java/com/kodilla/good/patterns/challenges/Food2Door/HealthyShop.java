package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producent {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("HealthyShop realization order...");
        return new SMS().process(orderRequest);
    }
}
