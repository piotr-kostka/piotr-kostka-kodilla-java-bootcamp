package module2.excercise25;

import java.util.List;

public class ITDegrees {
    private List<Integer> degrees;

    public ITDegrees(List<Integer> degrees) {
        this.degrees = degrees;
    }

    public int getMax() {
        int max = 0;

        for (Integer degree : degrees) {
            if (degree > max) {
                max = degree;
            }
        }
        return max;
    }

    public int getMin() {
        int min = getMax();

        for (Integer degree : degrees) {
            if (degree < min) {
                min = degree;
            }
        }
        return min;
    }

    public double average() {
        double result = 0;
        double average;

        if(degrees.size() > 2) {
            degrees.remove(degrees.indexOf(getMax()));
            degrees.remove(degrees.indexOf(getMin()));

            for (Integer degree : degrees) {
                result += degree;
            }
            average = result / degrees.size();
        } else {
            average = -1;
        }
        return average;
    }
}
