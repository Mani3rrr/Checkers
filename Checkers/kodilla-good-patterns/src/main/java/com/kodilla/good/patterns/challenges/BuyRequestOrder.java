package com.kodilla.good.patterns.challenges;

import com.sun.prism.RenderTarget;

public class BuyRequestOrder {

    public BuyRequest order(){

        User user = new User("Tony", "Montana", 502342123);
        Product product = new Product("Pen", 10, 16.5);

        return new BuyRequest (user, product);
    }
}
