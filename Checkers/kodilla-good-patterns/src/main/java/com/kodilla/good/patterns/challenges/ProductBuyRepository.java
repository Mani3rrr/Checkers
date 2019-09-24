package com.kodilla.good.patterns.challenges;

public class ProductBuyRepository implements BuyRepository {
    private User user;
    private Product product;

    @Override
    public boolean newBuy(User user, Product product) {
        this.user = user;
        this.product = product;
        return true;
    }
}
