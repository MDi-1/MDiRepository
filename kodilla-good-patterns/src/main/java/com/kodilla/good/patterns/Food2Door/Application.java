package com.kodilla.good.patterns.Food2Door;

interface Supplier{

    void process(ProductOrder order);
    ProductOrder confirm(ProductOrder order);
    ProductOrder getOrderProcessed();
}

class Retriever {
    ProductOrder retrieve() {
        Purchaser buyer = new Purchaser("John Doe", "SomeTown SomeStreet");
        Product product = new Product("Example Product", 4.44f);
        return new ProductOrder(buyer, product, true, buyer.getAddress(), false);
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

//zastanowić się czy klasy producentów nie powinny dziedziczyć po klasie Library
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

    int evaluateBestSupplier(ProductOrder order) {}
}

class ExtraFoodShop implements Supplier {                       // supplier #1

    private Communications communications = new Communications();
    private Library lib = new Library();
    private ProductOrder orderProcessed = null;

    // teraz piszemy tą f. jako prototyp
    public void process(ProductOrder order){
        boolean accepted = lib.getPaidStatus(order) && lib.isAccountValid(order) && lib.isProductAvailable(order);
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
    }

    public ProductOrder getOrderProcessed() {
        return orderProcessed;
    }
}

class HealthyShop implements Supplier {                         // supplier #2

    private Communications communications = new Communications();
    private Library lib = new Library();
    private ProductOrder orderProcessed = null;

    public void process(ProductOrder order){
        this.orderProcessed = confirm(order);
    }

    public ProductOrder confirm(ProductOrder order) {
        order.setOrderPassed(true);
        communications.sendMessages();
        new Archive().sendToArchive();
    }

    public ProductOrder getOrderProcessed() {
        return orderProcessed;
    }
}

class GlutenFreeShop implements Supplier {                      // supplier #3

    private Communications communications = new Communications();
    private Library lib = new Library();
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
    }

    public ProductOrder getOrderProcessed() {
        return orderProcessed;
    }
}

public class Application {
    Library lib = new Library();
    Supplier supplier;

    ProductOrder makeOrder(ProductOrder order) {
        System.out.println("Item: " + product + " cost: " + price +
                " has been ordered by " + name + " " + surname +
                ". Address of delivery: " + address);
        return order;
    }

    Supplier selectSupplier() {
        switch (lib.evaluateBestSupplier(ProductOrder order)) {
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
        supplier = selectSupplier();
        supplier.process(orderRequested);
        orderResult = getOrderProcessed();

        System.out.println(orderResult);
    }
}

class Communications {
    void sendMessages() {}
}

class Archive {
    void sendToArchive() {}
}
// Pytanie do mentora: W jakie mogłyby być sposoby na
// ODP - jeśli klient wciśnie to -> to użyj obiektu klasy dostawcy takiego albo jeśli cena jest najniższa u tego to użyj obiektu klasy dostawcy takiego.
// Jednak... czy da się w przypadku takim: Interface object = new ClassName();
// podać w jakiś sposób odpowiedniego dostawcę jako ClassName? bez potrzeby
// pamiętania o tym że trzeba modyfikować metodę
// int evaluateBestSupplier(ProductOrder order) oprócz dopisywania klas interfejsu
// Supplier w momencie gdy trzeba będzie dopisać nowych dostawców?
