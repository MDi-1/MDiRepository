package com.kodilla.good.patterns.Food2Door;

interface Supplier{

    // realizacja zamówienia w danym sklepie
    void process(ProductOrder order);

    // czy udało się zrealizować i tym podobne informacje
    ProductOrder confirm(ProductOrder order);
}

class Retriever {
    ProductOrder retrieve() {
        Purchaser buyer = new Purchaser( purchaser_args );
        // purchase details
        return new ProductOrder( order_args );
    }
}

class ProductOrder {
    // objects of this class will also serve as Data Transfer Object
    private Purchaser purcahser;
    private Product product;
    private boolean paid;
    private String address;
    private boolean orderPassed;

    public ProductOrder(Purchaser purcahser, Product product, boolean paid, String address, boolean orderPassed) {
        this.purcahser = purcahser;
        this.product = product;
        this.paid = paid;
        this.address = address;
        this.orderPassed = orderPassed;
    }

    public Purchaser getPurcahser() {
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

class Purchaser {
    private String fullname;
    private String address;
}

class Product {
    private String name;
    private double price;
}

class Library {

    double getPrice(ProductOrder order) {
        double price = 0;
        return price;
    }

    int getDeliveryTime(ProductOrder order) {
        int time = 0; // days
        return time;
    }

    boolean getPaidStatus(ProductOrder order) {
        return false;
    }

    boolean isAccountValid(ProductOrder order) {
        return false;
    }

    boolean isProductAvailable(ProductOrder order) {
        return false;
    }

    boolean canDeliverToLocation(ProductOrder order) {
        return false;
    }

    void sendOrderObjectToSupplier(ProductOrder order) {}

}

class ExtraFoodShop implements Supplier {
    Communications communications = new Communications();
    Library lib = new Library();

    private ProductOrder orderInProcess = null; // czy to potrzebne?

    // teraz piszemy tą f. jako prototyp
    public void process(ProductOrder order){
        boolean accepted = lib.getPaidStatus(order) && lib.isAccountValid(order) && lib.isProductAvailable(order);
        if (accepted) {
            confirm(order);
        } else {
            communications.reject(order);
        }
    }

    public ProductOrder confirm(ProductOrder order) {
        Archive archive = new Archive();

        order.setOrderPassed(true);
        communications.sendMessages();
        archive.sendToArchive();
    }
}

class HealthyShop implements Supplier {}
class GlutenFreeShop implements Supplier {}

public class Application {

    void some_function1() {                     // 2 B deleted?
    }

    ProductOrder makeOrder(ProductOrder order) {
        System.out.println("Item: " + product + " cost: " + price +
                " has been ordered by " + name + " " + surname +
                ". Address of delivery: " + address);
        return order;
    }

    public static void main(String[] args) {
        System.out.println("\nKodilla exercise 13.4: Food2Door");
        Application app = new Application();
        ProductOrder orderQuery = new Retriever().retrieve();
        ProductOrder orderRequested = app.makeOrder(orderQuery);

    }
}

class Communications {
    void reject(ProductOrder order) {}
    void sendMessages() {}
}

class Archive {
    void sendToArchive() {}
}
