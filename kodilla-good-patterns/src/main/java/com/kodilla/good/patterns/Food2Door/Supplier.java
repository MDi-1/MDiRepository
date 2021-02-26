package com.kodilla.good.patterns.Food2Door;

interface Supplier {

    void process(ProductOrder order);

    ProductOrder confirm(ProductOrder order);

    ProductOrder getOrderProcessed();
}
