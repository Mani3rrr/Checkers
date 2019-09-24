package com.kodilla.good.patterns.challenges;

public class ProductBuyService implements BuyService {

    private User user = new User("Tony", "Montana", 502342123);
    private Product product = new Product("Pen", 10, 16.5);
    private boolean buyer = false;
    private boolean object = false;

    @Override
    public boolean buy(User user, Product product){

        if(this.user.getName().equals(user.getName()) && this.user.getNickName().equals(user.getNickName())){
            return buyer = true;
        }
        if(this.product.getName().equals(product.getName()) && this.product.getQuantity() == (product.getQuantity()) && this.product.getPrice() == (product.getPrice()) ){
            return object = true;
        }
        if(buyer && object){
            return true;
        }else{
            return false;}
    }
}
