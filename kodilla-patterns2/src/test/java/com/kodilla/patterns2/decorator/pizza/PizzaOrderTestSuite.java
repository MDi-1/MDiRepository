package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testHamAndSauceGetDescription() {
        // given
        PizzaOrder orderedPizza = new SimplePizza();
        orderedPizza = new DecorationWithHam(orderedPizza);
        orderedPizza = new AdditionalSauce(orderedPizza);
        // when
        String text = orderedPizza.getDescription();
        // then
        assertEquals("Pizza with cheese and tomato sauce, ham, extra sauce", text);
    }

    @Test
    public void testHamAndSauceGetCost() {
        // given
        PizzaOrder orderedPizza = new SimplePizza();
        orderedPizza = new DecorationWithHam(orderedPizza);
        orderedPizza = new AdditionalSauce(orderedPizza);
        // when
        float overallCost = orderedPizza.getCost();
        // then
        assertEquals(26, overallCost);
    }

    @Test
    public void testMushroomsOnionPeppersGetDescription() {
        // given
        PizzaOrder orderedPizza = new SimplePizza();
        orderedPizza = new DecorationWithMushrooms(orderedPizza);
        orderedPizza = new DecorationWithOnion(orderedPizza);
        orderedPizza = new DecorationWithPeppers(orderedPizza);
        // when
        String text = orderedPizza.getDescription();
        // then
        assertEquals("Pizza with cheese and tomato sauce, mushrooms, onion, peppers", text);
    }

    @Test
    public void testMushroomsOnionPeppersGetCost() {
        // given
        PizzaOrder orderedPizza = new SimplePizza();
        orderedPizza = new DecorationWithMushrooms(orderedPizza);
        orderedPizza = new DecorationWithOnion(orderedPizza);
        orderedPizza = new DecorationWithPeppers(orderedPizza);
        // when
        float overallCost = orderedPizza.getCost();
        // then
        assertEquals(23, overallCost);
    }

    @Test
    public void testSalamiPeppersSauceGetDescription() {
        // given
        PizzaOrder orderedPizza = new SimplePizza();
        orderedPizza = new DecorationWithSalami(orderedPizza);
        orderedPizza = new DecorationWithPeppers(orderedPizza);
        orderedPizza = new AdditionalSauce(orderedPizza);
        // when
        String text = orderedPizza.getDescription();
        // then
        assertEquals("Pizza with cheese and tomato sauce, salami, peppers, extra sauce", text);
    }

    @Test
    public void testSalamiPeppersSauceGetCost() {
        // given
        PizzaOrder orderedPizza = new SimplePizza();
        orderedPizza = new DecorationWithSalami(orderedPizza);
        orderedPizza = new DecorationWithPeppers(orderedPizza);
        orderedPizza = new AdditionalSauce(orderedPizza);
        // when
        float overallCost = orderedPizza.getCost();
        // then
        assertEquals(29, overallCost);
    }
}
