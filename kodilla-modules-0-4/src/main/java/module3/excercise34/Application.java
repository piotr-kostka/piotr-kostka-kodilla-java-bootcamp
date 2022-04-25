package module3.excercise34;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class Application {

    public static void main (String[] args) {

        //część 1//
        Deque<String> letterSnake = new ArrayDeque<>();

        while(letterSnake.size()<50) {

            letterSnake.offer(randomSnake());
        }

        //część 2//

        Snake snake = new Snake(letterSnake);

        System.out.println("Wężyk parzystej liczby znaków:");
        snake.printEven(snake.divideEven(snake.getList(letterSnake)));

        System.out.println();

        System.out.println("Wężyk nieparzystej liczby znaków:");
        snake.printOdd(snake.divideOdd(snake.getList(letterSnake)));
    }

    public static String randomSnake() {

        Random random = new Random();
        StringBuilder snake = new StringBuilder();

        for(int i = 0; i < random.nextInt(50)+1; i++) {

            snake.append('A');
        }
        return snake.toString();
    }
}
