interface Supplier{

    // realizacja zamówienia w danym sklepie
    void process();

    // czy udało się zrealizować i tym podobne informacje
    void confirm();
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

    double getPrice(ProductOrder order) {}
    int getDeliveryTime(ProductOrder order) {}
    boolean getPaidStatus(ProductOrder order) {}
    boolean isAccountValid(ProductOrder order) {}
    boolean isProductAvailable(ProductOrder order) {}
    boolean canDeliverToLocation(ProductOrder order) {}
    void sendOrderObjectToSupplier(ProductOrder order) {}

}

class ExtraFoodShop implements Supplier {
    private ProductOrder orderInProcess = null; // czy to potrzebne?

    // teraz piszemy tą f. jako prototyp
    void process(ProductOrder order){
        boolean accepted = lib.getPaidStatus() && lib.isAccountValid() && isProductAvailable();
        if (accepted) {
            confirm(order);
        } else {
            order.setOrderPassed(false);
        }
    }

    ProductOrder confirm(ProductOrder order) {
        Communications communications = new Communications();
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
        return order
    }

    public static void main(String[] args) {
        System.out.println("\nKodilla exercise 13.4: Food2Door");
        Application app = new Application();
        ProductOrder orderQuery = new Retriever().retrieve();
        ProductOrder orderRequested = app.makeOrder(orderQuery);

    }
}

interface Communications {
    void sendMessages();
}

class Archive {
    void sendToArchive();
}
