package com.kodilla.good.patterns.Food2Door;

class Retriever {
    ProductOrder retrieve() {
        Purchaser buyer = new Purchaser("John Doe", "SomeTown SomeStreet");
        Product product = new Product("Example_Product", 4.44);
        return new ProductOrder(buyer, product, true, buyer.getAddress(), false);
    }
}
