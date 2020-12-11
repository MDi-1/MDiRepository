package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite{

    @BeforeEach
    public void before() { System.out.println("Test Case: started"); }

    @AfterEach
    public void after() { System.out.println("Test Case: finished"); }

    @BeforeAll
    public static void beforeAll() { System.out.println("Test Suite: started"); }

    @AfterAll
    public static void afterAll() { System.out.println("Test Suite: finished"); }

    @DisplayName("when tested class receives empty list, output list should be empty too")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //when
        int expected = 0;
        int listLength = ext.exterminate(emptyList).size();
        //then
        Assertions.assertEquals(expected, listLength);
    }

    @DisplayName("when tested class receives the list, output list should not contain any odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        Execlass normList = new Execlass();
        List<Integer> list = normList.listGen();
        //when
        List<Integer> listout = ext.exterminate(list);
        boolean thereAreOdds = true;
        boolean expected = false;
        for (int element : listout) {
            if (element % 2 == 0) thereAreOdds = false;
        }
        //then
        Assertions.assertEquals(expected, thereAreOdds);
    }
}
