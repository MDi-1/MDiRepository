package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);
        //when
        double valueAdding = calc.add(2, 5);
        double valueSubtracting = calc.sub(2, 5);
        double valueMultiplying = calc.mul(2, 5);
        double valueDividing = calc.div(2, 5);
        //then
        assertEquals(7, valueAdding);
        assertEquals(-3, valueSubtracting);
        assertEquals(10, valueMultiplying);
        assertEquals(0.4, valueDividing);
    }
}
