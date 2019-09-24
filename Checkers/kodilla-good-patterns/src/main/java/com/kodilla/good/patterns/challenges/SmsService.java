package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {

    @Override
    public void send(BuyRequest buyRequest) {
        System.out.println("SMS has been sent to: " + buyRequest.getUser().getNickName() + "to the number: " + buyRequest.getUser().getNumber() );
        System.out.println(buyRequest.getUser().getNickName() + " your order has been made. Your order: " + buyRequest.getProduct().getName()
                + " quantity: " + buyRequest.getProduct().getQuantity() + " price: " + buyRequest.getProduct().getPrice());

    }
}
