package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        System.out.println("Exercise 7.5; displaying array values as follows:");
        IntStream.rangeClosed(0, numbers.length - 1)
                .map(s -> numbers[s])
                .forEach(System.out::println);

        return IntStream.rangeClosed(0, numbers.length - 1)
                .map(s -> numbers[s])
                .average().getAsDouble();
    }
}
