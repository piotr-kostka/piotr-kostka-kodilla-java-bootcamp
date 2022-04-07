package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> numbers;

    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate() {

        List <Integer> oddNumbers = new ArrayList();

        for (Integer number : numbers) {
            if (number %2 == 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}
