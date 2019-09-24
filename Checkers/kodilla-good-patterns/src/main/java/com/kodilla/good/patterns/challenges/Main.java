package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args){
        BuyRequestOrder buyRequestOrder = new BuyRequestOrder();
        BuyRequest buyRequest = buyRequestOrder.order();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(), new ProductBuyService(), new ProductBuyRepository());
        productOrderService.process(buyRequest);



    }
}
