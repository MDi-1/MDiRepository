package com.kodilla.patterns2.decorator.pizza;

public class DecorationWithMushrooms extends PizzaDecorator {
    protected DecorationWithMushrooms(PizzaOrder order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", mushrooms";
    }

    public float getCost() {
        return super.getCost() + 3;
    }
}
