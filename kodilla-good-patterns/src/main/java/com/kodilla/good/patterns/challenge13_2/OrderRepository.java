package com.kodilla.good.patterns.challenge13_2;

import java.time.LocalDateTime;

interface OrderRepository {
    void putOrder(OrderRequest orderRequest);
}
