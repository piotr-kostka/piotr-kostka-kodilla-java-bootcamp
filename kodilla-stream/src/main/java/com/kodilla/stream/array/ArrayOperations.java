package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        double average;
        if (numbers.length > 0) {
            IntStream.range(0, numbers.length)
                    .forEach(number -> System.out.println(numbers[number]));

            average = IntStream.range(0, numbers.length)
                    .mapToDouble(number -> numbers[number])
                    .average()
                    .getAsDouble();
        } else {return 0;}
        return average;
    }
}
