package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> survivorNumbers = new ArrayList<>();
        Collections.sort(numbers);
        for (Integer element : numbers) {
            if (element % 2 == 0) survivorNumbers.add(element);
        }
        if (survivorNumbers.size() != 0) {
            System.out.println(" ---- odd numbers exterminated ----");
        } else { System.out.println(" ---- list is empty ----"); }
        return survivorNumbers;
    }
    public void display(List<Integer> num) {
        int i = 1;
        for (Integer element : num) {
            String printout = String.format("%03d", element);
            System.out.print(printout + "\t\t");
            i ++;
            if (i > 8) {  i = 1;  System.out.print("\n"); }
        }
    }
}