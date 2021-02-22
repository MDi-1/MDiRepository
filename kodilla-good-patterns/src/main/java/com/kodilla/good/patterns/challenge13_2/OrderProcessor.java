package com.kodilla.good.patterns.challenge13_2;

public class OrderProcessor {
    private NotificationService notificationService;
    private OrderingService orderingService;
    private OrderRepository orderRepository;

    public OrderProcessor(final NotificationService notificationService,
                          final OrderingService orderingService,
                          final OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.orderingService = orderingService;
        this.orderRepository = orderRepository;
    }
    OrderDTO process(final OrderRequest orderRequest) {
        boolean orderAccepted = orderingService.order(
                orderRequest.getCustomer(),
                orderRequest.getProductID(),
                orderRequest.getPrice(),
                orderRequest.getDeliveryDate());
        if (orderAccepted) {
            notificationService.sendNotification(orderRequest.getCustomer());
            orderRepository.putOrder(
                    orderRequest.getCustomer(),
                    orderRequest.getProductID(),
                    orderRequest.getDeliveryDate());
            return new OrderDTO(orderRequest.getCustomer(), orderRequest.getProductID(), true);
        } else {
            return new OrderDTO(orderRequest.getCustomer(), orderRequest.getProductID(), false);
        }
    }
}
