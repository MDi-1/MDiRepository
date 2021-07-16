package com.kodilla.patterns2.decorator.pizza;

public class DecorationWithOnion extends PizzaDecorator {
    protected DecorationWithOnion(PizzaOrder order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", onion";
    }

    public float getCost() {
        return super.getCost() + 2;
    }
}
