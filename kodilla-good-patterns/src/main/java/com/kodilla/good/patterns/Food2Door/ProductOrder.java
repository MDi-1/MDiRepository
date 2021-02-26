package com.kodilla.good.patterns.Food2Door;

class ProductOrder {
    // objects of this class will also serve as Data Transfer Object
    private final Purchaser purcahser;
    private final Product product;
    private final boolean paid;
    private final String address;
    private boolean orderPassed;

    public ProductOrder(Purchaser purcahser, Product product, boolean paid, String address, boolean orderPassed) {
        this.purcahser = purcahser;
        this.product = product;
        this.paid = paid;
        this.address = address;
        this.orderPassed = orderPassed;
    }

    public Purchaser getPurchaser() {
        return purcahser;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isPaid() {
        return paid;
    }

    public String getAddress() {
        return address;
    }

    public boolean isOrderPassed() {
        return orderPassed;
    }

    public void setOrderPassed(boolean orderPassed) {
        this.orderPassed = orderPassed;
    }
}
