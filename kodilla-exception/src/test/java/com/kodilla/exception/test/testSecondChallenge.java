package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testSecondChallenge {

    @Test
    void functionTest() {
        // Given
        ExceptionHandling handling = new ExceptionHandling();
        // Then
        assertDoesNotThrow(() -> handling.exefunction(1, 1));
    }

    @Test
    void functionTestWithException1() {
        // Given
        ExceptionHandling handling = new ExceptionHandling();
        // Then
        assertThrows(Exception.class, () -> handling.exefunction(1.5, 1.5));
    }

    @Test
    void functionTestWithException2() {
        // Given
        ExceptionHandling handling = new ExceptionHandling();
        // Then
        assertThrows(Exception.class, () -> handling.exefunction(2, 2));
    }

    @Test
    void functionTestWithException3() {
        // Given
        ExceptionHandling handling = new ExceptionHandling();
        // Then
        assertThrows(Exception.class, () -> handling.exefunction(0, 0));
    }
}