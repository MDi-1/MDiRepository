package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired //- nie wiem czy to tu winno być
    Display display;

    double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }
    double sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }
    double mul(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }
    double div(double a, double b) {
        double val = a / b;
        display.displayValue(val);
        return val;
    }
}
