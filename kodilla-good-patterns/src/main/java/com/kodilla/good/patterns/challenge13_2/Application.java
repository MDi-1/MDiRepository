package com.kodilla.good.patterns.challenge13_2;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest order = retriever.retrieve();

        OrderProcessor orderProcess = new OrderProcessor(
                new TextingService(), new ProductOrderService(), new OrderStorageFacility());
        orderProcess.process(order);
    }
}
