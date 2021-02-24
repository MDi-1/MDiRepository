package com.kodilla.good.patterns.challenge13_2;

public class OrderProcessor {
    private TextingService notificationService;
    private ProductOrderService orderingService;
    private OrderStorageFacility orderRepository;

    public OrderProcessor(final TextingService notificationService,
                          final ProductOrderService orderingService,
                          final OrderStorageFacility orderRepository) {
        this.notificationService = notificationService;
        this.orderingService = orderingService;
        this.orderRepository = orderRepository;
    }

    OrderDTO process(final OrderRequest orderRequest) {
        boolean orderAccepted = orderingService.order(orderRequest);
        if (orderAccepted) {
            notificationService.sendNotification(orderRequest.getCustomer());
            orderRepository.putOrder(orderRequest);
            return new OrderDTO(orderRequest.getCustomer(), orderRequest.getProductID(), true);
        } else {
            return new OrderDTO(orderRequest.getCustomer(), orderRequest.getProductID(), false);
        }
    }
}
