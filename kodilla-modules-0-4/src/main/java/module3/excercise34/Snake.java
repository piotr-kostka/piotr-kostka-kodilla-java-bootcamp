package module3.excercise34;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Snake {

    Deque<String> letterSnake;
    List<String> list = new ArrayList();
    List<String> odd = new ArrayList(); // nieparzyste
    List<String> even = new ArrayList(); // parzyste

    public Snake(Deque<String> letterSnake) {
        this.letterSnake = letterSnake;
    }

    public List<String> getList(Deque<String> letterSnake) {

        while (letterSnake.size() > 0) {

            //String deque = letterSnake.poll();
            list.add(letterSnake.poll());
        }
        return list;
    }

    public List<String> divideEven(List<String> list) {

        for (String check : list) {

            if (check.length() % 2 == 0) {
                even.add(check);
            }
        }
        return even;
    }

    public List<String> divideOdd(List<String> list) {

        for (String check : list) {

            if (check.length() % 2 != 0) {
                odd.add(check);
            }
        }
        return odd;
    }

    public void printEven(List<String> even) {

        for (String print : even) {
            System.out.println(print);
        }
    }

    public void printOdd(List<String> odd) {

        for (String print : odd) {
            System.out.println(print);
        }
    }
}
