package com.kodilla.good.patterns.Food2Door;

public class Application {
    Library lib = new Library();
    Supplier supplier;

    ProductOrder makeOrder(ProductOrder order) {
        System.out.println("Item: " + order.getProduct().getName() +
                " cost: " + order.getProduct().getPrice() +
                " has been ordered by " + order.getPurchaser().getFullname() +
                ". Address of delivery: " + order.getPurchaser().getAddress());
        return order;
    }

    Supplier selectSupplier(ProductOrder order) {
        switch (lib.evaluateBestSupplier(order)) {
            case 1:
                supplier = new ExtraFoodShop();
                break;
            case 2:
                supplier = new HealthyShop();
                break;
            case 3:
                supplier = new GlutenFreeShop();
                break;
        } return supplier;
    }

    public static void main(String[] args) {
        ProductOrder orderQuery, orderRequested, orderResult;
        Application app = new Application();
        Supplier supplier;

        System.out.println("\nKodilla exercise 13.4: Food2Door");
        orderQuery = new Retriever().retrieve();
        orderRequested = app.makeOrder(orderQuery);
        supplier = app.selectSupplier(orderQuery);
        supplier.process(orderRequested);
        orderResult = supplier.getOrderProcessed();

        System.out.println("Has order request passed through process() function?: " + orderResult.isOrderPassed());
    }
}