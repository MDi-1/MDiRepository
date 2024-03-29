package com.kodilla.patterns2.decorator.pizza;

public abstract class PizzaDecorator implements PizzaOrder{
    private final PizzaOrder order;

    protected PizzaDecorator(PizzaOrder order) {
        this.order = order;
    }

    public String getDescription() {
        return order.getDescription();
    }

    public float getCost() {
        return order.getCost();
    }
}
