package com.kodilla.good.patterns.challenge13_2;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderingService {

    public boolean order(final OrderRequest order) {
        System.out.println("Preparing order for: " +
                order.getCustomer().getName() +
                " " + order.getCustomer().getSurname() +
                " product ID: " + order.getProductID() +
                " at pice $" + order.getPrice() +
                " to be delivered: " + order.getDeliveryDate().toString());
        return true;
    }
}
