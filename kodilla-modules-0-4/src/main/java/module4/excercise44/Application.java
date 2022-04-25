package module4.excercise44;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main (String[] args) {

        CannonLoader loader = new CannonLoader(initCannons());

        loader.loadAll();

        List<Cannon> loadedCannons = loader.loadAll();
        loader.printLoaded(loadedCannons);
    }

    public static List<Cannon> initCannons() {

        Random random = new Random();

        List<Cannon> cannons = new LinkedList<>();

        for(int i = 1; i < 6; i++) {
            cannons.add(new Cannon("Cannon [" + i + "]", random.nextBoolean()));
        }
        return cannons;
    }
}
