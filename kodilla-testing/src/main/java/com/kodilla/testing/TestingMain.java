package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser"))  System.out.println("test OK");
        else  System.out.println("Error!");

        Calculator calc = new Calculator();
        int testadd = calc.add(12345678, 987654321);
        int testsub = calc.subtract(987654321, 876543210);
        if (testadd - testsub == 888888888) System.out.println(" ---- calc test OK ----");
        else System.out.println(" ---- calc test Error! ----");
    }
}
