package com.kodilla.good.patterns.challenge13_2;

public class OrderDTO {
    private Customer customer;
    private int productId;
    private boolean orderAccepted;

    public OrderDTO(Customer customer, int productId, boolean orderAccepted) {
        this.customer = customer;
        this.productId = productId;
        this.orderAccepted = orderAccepted;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getProductId() {
        return productId;
    }

    public boolean isOrderAccepted() {
        return orderAccepted;
    }
}
