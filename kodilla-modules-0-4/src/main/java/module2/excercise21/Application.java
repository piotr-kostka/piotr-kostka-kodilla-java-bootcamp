package module2.excercise21;

import java.util.Random;

public class Application {

    private static Random random = new Random();

    public static void main (String[] args) {


        NumbersProcessor numbersProcessor = new NumbersProcessor(initNumbers(20));

        numbersProcessor.printNumbers();

        double result = numbersProcessor.average();
        System.out.println("Średnia z powyższyh liczb wynosi: " + result);

    }

    private static int[] initNumbers(int size) {

        int[] numbers = new int[size];

        for (int i=0; i<size; i++) {
            numbers[i] = random.nextInt(20)+1;
        }

        return numbers;
    }
}
