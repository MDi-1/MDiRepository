package com.kodilla.good.patterns.challenge13_2;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderingService{

    public boolean order(final Customer customer, final int productId ,final float price, final LocalDateTime deliveryDate) {
        System.out.println("Preparing order to: " + customer.getName() + " " + customer.getSurname() +
                " product ID: " + productId +
                " at pice $" + price +
                " to be delivered: " + deliveryDate.toString());
        return true;
    }
}
