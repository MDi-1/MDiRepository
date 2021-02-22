package com.kodilla.good.patterns.challenge13_2;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("Jan", "Kowalski", "nie chce podać adresu");
        int productId = 12345;
        float currentPrice = 9.99f;
        LocalDateTime deliveryDate = LocalDateTime.of(2021, 1, 9, 11, 1);
        return new OrderRequest(customer, productId, currentPrice, deliveryDate);
    }
}
