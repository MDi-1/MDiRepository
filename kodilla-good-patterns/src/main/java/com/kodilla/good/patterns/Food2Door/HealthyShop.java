package com.kodilla.good.patterns.Food2Door;

class HealthyShop implements Supplier {                         // supplier #2

    private final Communications communications = new Communications();
    private final Library lib = new Library();
    private ProductOrder orderProcessed = null;

    public void process(ProductOrder order){
        this.orderProcessed = confirm(order);
    }

    public ProductOrder confirm(ProductOrder order) {
        order.setOrderPassed(true);
        communications.sendMessages();
        new Archive().sendToArchive();
        return order;
    }

    public ProductOrder getOrderProcessed() {
        return orderProcessed;
    }
}
