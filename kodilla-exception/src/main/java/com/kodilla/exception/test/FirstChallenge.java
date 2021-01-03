package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) throw new ArithmeticException();
            return a / b;
        } catch (ArithmeticException x) {
            System.out.println("Division by zero!");
            return 0;
        } finally {
            System.out.println("method will display some result regardless if there was division by 0 or not");
        }
    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }
}