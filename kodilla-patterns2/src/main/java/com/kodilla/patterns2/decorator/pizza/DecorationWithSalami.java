package com.kodilla.patterns2.decorator.pizza;

public class DecorationWithSalami extends PizzaDecorator {
    protected DecorationWithSalami(PizzaOrder order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", salami";
    }

    public float getCost() {
        return super.getCost() + 7;
    }
}
