package com.kodilla.patterns2.decorator.pizza;

public class DecorationWithPeppers extends PizzaDecorator {
    protected DecorationWithPeppers(PizzaOrder order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", peppers";
    }

    public float getCost() {
        return super.getCost() + 3;
    }
}
