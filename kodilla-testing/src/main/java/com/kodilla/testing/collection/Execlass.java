package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Execlass {
    public List<Integer> listGen() {
        List<Integer> generatedList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int element = random.nextInt(1000);
            generatedList.add(element);
        } return generatedList;
    }
    public static void main (String[] args) {
        OddNumbersExterminator extObject = new OddNumbersExterminator();
        extObject.display(extObject.exterminate(new Execlass().listGen()));
    }
}
