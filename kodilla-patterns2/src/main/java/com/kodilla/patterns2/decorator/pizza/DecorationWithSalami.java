package com.kodilla.patterns2.decorator.pizza;

public class DecorationWithSalami extends PizzaDecorator {
    protected DecorationWithSalami(PizzaOrder order) {
        super(order);
    }
}
