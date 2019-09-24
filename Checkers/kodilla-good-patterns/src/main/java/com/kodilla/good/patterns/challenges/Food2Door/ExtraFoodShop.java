package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Producent {
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("ExtraFoodShoop realization order...");
        return new SMS().process(orderRequest);
    }
}
