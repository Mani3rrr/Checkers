package com.kodilla.good.patterns.challenges.Food2Door;

public class Main {

    public static void main(String[] args) {
        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest1 = requestRetriever.getOrderGluten();
        OrderRequest orderRequest2 = requestRetriever.getOrderHealthy();

        OrderProcess orderProcessor1 = new OrderProcess(orderRequest1);
        OrderProcess orderProcessor2 = new OrderProcess(orderRequest2);

        if(orderProcessor1.process()) {
            System.out.println("Order finalized");
        } else {
            System.out.println("Error");
        }

        if(orderProcessor2.process()) {
            System.out.println("Order finalized");
        } else {
            System.out.println("Error");
        }
    }
}
