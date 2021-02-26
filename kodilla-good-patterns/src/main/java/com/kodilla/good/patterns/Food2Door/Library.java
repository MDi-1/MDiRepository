package com.kodilla.good.patterns.Food2Door;

class Library {

    void reject(ProductOrder order) {

    }

    double getPrice(ProductOrder order) {
        double price = 0;
        return price;
    }

    int getDeliveryTime(ProductOrder order) {
        int time = 0; // days
        return time;
    }

    boolean getPaidStatus(ProductOrder order) {
        return true;
    }

    boolean isAccountValid(ProductOrder order) {
        return true;
    }

    boolean isProductAvailable(ProductOrder order) {
        return true;
    }

    boolean canDeliverToLocation(ProductOrder order) {
        return true;
    }

    void sendOrderObjectToSupplier(ProductOrder order) {

    }

    int evaluateBestSupplier(ProductOrder order) {
        return 1;
    }
}
