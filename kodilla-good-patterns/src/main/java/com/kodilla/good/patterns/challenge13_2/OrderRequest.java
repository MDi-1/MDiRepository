package com.kodilla.good.patterns.challenge13_2;

import java.time.LocalDateTime;

public class OrderRequest {
    private Customer customer;
    private int productID;
    private float price;
    private LocalDateTime deliveryDate;

    public OrderRequest(Customer customer, int productID, float price, LocalDateTime deliveryDate) {
        this.customer = customer;
        this.productID = productID;
        this.price = price;
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getProductID() {
        return productID;
    }

    public float getPrice() {
        return price;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }
}
