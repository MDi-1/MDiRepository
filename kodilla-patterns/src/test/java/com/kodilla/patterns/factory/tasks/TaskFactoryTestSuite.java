package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @BeforeAll
    static void intro() {
        System.out.println("\n]]]] Kodilla exercise 15.4 TaskFactory [[[[");
    }

    @Test
    void testShopping() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task shop = factory.getTask(TaskFactory.SHOP);

        // then
        assertEquals("just buy", shop.getTaskName());
        assertEquals("bought 3.2L of paint.", shop.executeTask());
        assertTrue(shop.isTaskExecuted());
    }

    @Test
    void testDriving() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task drive = factory.getTask(TaskFactory.DRIVE);

        // then
        assertEquals("just drive", drive.getTaskName());
        assertEquals("take the truck and just drive to that store", drive.executeTask());
        assertTrue(drive.isTaskExecuted());
    }

    @Test
    void testPainting() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task paint = factory.getTask(TaskFactory.PAINT);

        // then
        assertEquals("paint", paint.getTaskName());
        assertEquals("that wall has been painted white", paint.executeTask());
        assertTrue(paint.isTaskExecuted());
    }
}
