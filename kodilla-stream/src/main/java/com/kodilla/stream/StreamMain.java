package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
/*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("\n\n---- Starting execution of Kodilla exercise 7.1 ----\n", txt -> txt);
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> txt.toUpperCase());
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> txt.toLowerCase());
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> txt.replace(" ", "_"));
        beautifier.beautify("This is just sample text for Poem Beautifier.", txt -> " --== " + txt + " ==-- ");

 */
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}