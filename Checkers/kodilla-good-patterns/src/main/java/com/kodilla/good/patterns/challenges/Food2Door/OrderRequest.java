package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class OrderRequest {
        private Producent producent;
        private HashMap<Product, Integer> products;
        private User user;

        public OrderRequest(Producent producent, HashMap<Product, Integer> products, User user) {
            this.producent = producent;
            this.products = products;
            this.user = user;
        }

        public Producent getProducent() {
            return producent;
        }

        public HashMap<Product, Integer> getProducts() {
            return products;
        }

        public User getUser() {
            return user;
        }






    }

