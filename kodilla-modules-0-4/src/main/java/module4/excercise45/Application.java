package module4.excercise45;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main (String[] args) {

        for(Clock clock : initClocks()) {

            System.out.println("Godzina po dodaniu minuty - " + clock.getClockName() + ": " + clock.addMinute());
        }

    }

    public static List<Clock> initClocks() {

        List<Clock> clocks = new LinkedList<>();

        clocks.add(new Clock("Warszawa", 12, 30, 15));
        clocks.add(new Clock("Tokio", 20, 30, 15));
        clocks.add(new Clock("Londyn", 11, 30, 15));
        clocks.add(new Clock("Nowy Jork", 7, 30, 15));

        return clocks;
    }
}
