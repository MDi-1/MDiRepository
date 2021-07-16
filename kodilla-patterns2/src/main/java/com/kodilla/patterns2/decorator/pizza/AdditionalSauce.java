package com.kodilla.patterns2.decorator.pizza;

public class AdditionalSauce extends PizzaDecorator {
    protected AdditionalSauce(PizzaOrder order) {
        super(order);
    }
}
