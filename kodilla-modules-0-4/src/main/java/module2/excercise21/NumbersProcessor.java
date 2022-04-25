package module2.excercise21;

public class NumbersProcessor {

    private int[] numbers;

    public NumbersProcessor(int[] numbers) {
        this.numbers = numbers;
    }

    public void printNumbers() {
        for(int i=0; i<numbers.length; i++) {
            System.out.println("Number [" + i + "] equals: " + numbers[i]);
        }
    }

    public double average() {
        double result = 0;

        for (int i=0; i<numbers.length; i++) {
            result += numbers[i];
        }

        return result / numbers.length;
    }
}
