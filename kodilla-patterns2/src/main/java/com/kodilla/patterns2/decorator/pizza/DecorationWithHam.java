package com.kodilla.patterns2.decorator.pizza;

public class DecorationWithHam extends PizzaDecorator {
    protected DecorationWithHam(PizzaOrder order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", ham";
    }

    public float getCost() {
        return super.getCost() + 7;
    }
}
