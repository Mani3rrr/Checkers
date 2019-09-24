package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producent {

    OrderRequestRetriever retriever = new OrderRequestRetriever();
    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("GlutenFreeShop realization order..." + "Client: " + retriever.getOrderGluten().getUser().getName() + retriever.getOrderGluten().getUser().getSurname() + retriever.getOrderGluten().getProducts());
        return new SMS().process(orderRequest);
    }
}



