package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcess {
    OrderRequest orderRequest;

    public OrderProcess(OrderRequest orderRequest) {
        this.orderRequest = orderRequest;
    }

    public boolean process() {
        return orderRequest.getProducent().process(orderRequest);
    }
}
