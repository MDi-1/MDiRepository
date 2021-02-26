package com.kodilla.good.patterns.Food2Door;

class GlutenFreeShop implements Supplier {                      // supplier #3

    private final Communications communications = new Communications();
    private final Library lib = new Library();
    private ProductOrder orderProcessed = null;

    public void process(ProductOrder order){
        boolean accepted = lib.isProductAvailable(order) && lib.isAccountValid(order) && lib.canDeliverToLocation(order);
        if (accepted) {
            this.orderProcessed = confirm(order);
        } else {
            lib.reject(order);
        }
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
