package com.kodilla.patterns2.decorator.pizza;

public class SimplePizza implements PizzaOrder{

    public String getDescription() {
        return "Pizza with cheese and tomato sauce";
    }

    public float getCost() {
        return 15;
    }
}
