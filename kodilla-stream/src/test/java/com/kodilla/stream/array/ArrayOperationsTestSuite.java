package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        // Given
        int[] numbers = {
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 131, 132, 133, 134, 135, 136, 137, 138, 139};
        // When
        double average = ArrayOperations.getAverage(numbers);

        // Then
        assertEquals(119.05, average);
    }
}