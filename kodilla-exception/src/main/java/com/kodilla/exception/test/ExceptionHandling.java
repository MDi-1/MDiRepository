package com.kodilla.exception.test;

public class ExceptionHandling {
    public void exefunction(final double x, final double y) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            System.out.println(challenge.probablyIWillThrowException(x, y) + " no exception is thrown");
        } catch (Exception e) { e.printStackTrace();
            System.out.println("Exception thrown! variables are within range handled by exception");
        } finally {
            System.out.println("x = " + x + " ; y = " + y);
        }
    }
}