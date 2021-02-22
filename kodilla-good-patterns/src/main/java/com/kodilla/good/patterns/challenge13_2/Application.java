package com.kodilla.good.patterns.challenge13_2;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever retriever = new OrderRequestRetriever();
        OrderRequest order = retriever.retrieve();

        OrderProcessor orderProcess = new OrderProcessor(
            new NotificationService() {
                @Override
                public void sendNotification(Customer customer) {}
            },
            new OrderingService() {
            @Override
            public boolean order(Customer customer, int productId, float price, LocalDateTime date) { return false; }
            },
            new OrderRepository() {
            @Override
            public void putOrder(Customer customer, int productId, LocalDateTime date) {}
            });
        orderProcess.process(order);
    }
}
