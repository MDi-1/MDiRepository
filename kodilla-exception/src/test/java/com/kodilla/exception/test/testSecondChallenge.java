package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testSecondChallenge {

    @Test
    void functionTest() {
        // Given
        SecondChallenge handling = new SecondChallenge();
        // Then
        assertDoesNotThrow(() -> handling.probablyIWillThrowException(1, 1));
    }

    @Test
    void functionTestWithException1() {
        // Given
        SecondChallenge handling = new SecondChallenge();
        // Then
        assertThrows(Exception.class, () -> handling.probablyIWillThrowException(1.5, 1.5));
    }

    @Test
    void functionTestWithException2() {
        // Given
        SecondChallenge handling = new SecondChallenge();
        // Then
        assertThrows(Exception.class, () -> handling.probablyIWillThrowException(2, 2));
    }

    @Test
    void functionTestWithException3() {
        // Given
        SecondChallenge handling = new SecondChallenge();
        // Then
        assertThrows(Exception.class, () -> handling.probablyIWillThrowException(0, 0));
    }
}