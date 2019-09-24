package com.kodilla.good.patterns.challenges.Food2Door;

public class SMS {

    public boolean process(OrderRequest orderRequest) {
        System.out.println("Sending SMS to " + orderRequest.getUser().getTelephone() + "...");
        return true;
    }
}
