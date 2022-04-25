package module3.excercise33;

import java.util.Random;

public class Loop {
    Random random = new Random();

    int sumaA = 1000;
    int sumaB = 0;
    int counter = 0;

    public void sumRace() {

        while (sumaB < sumaA) {
            sumaA = sumaA + random.nextInt(9);
            sumaB = sumaB + random.nextInt(49);
            counter++;
            System.out.println("[SumaA: " + sumaA + "] [SumaB: " + sumaB + "] [Iteracja nr " + counter + "]");
        }
        System.out.println("Zakończono program. SumaB jest większa od SumyA po " + counter + " iteracjach");
    }
}
