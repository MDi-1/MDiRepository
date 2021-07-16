package com.kodilla.patterns2.decorator.pizza;

public class AdditionalSauce extends PizzaDecorator {
    protected AdditionalSauce(PizzaOrder order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", extra sauce";
    }

    public float getCost() {
        return super.getCost() + 4;
    }
}
