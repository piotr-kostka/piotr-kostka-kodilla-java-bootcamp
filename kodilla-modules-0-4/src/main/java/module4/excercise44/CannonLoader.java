package module4.excercise44;

import java.util.List;

public class CannonLoader {
    private List<Cannon> cannons;

    public CannonLoader(List<Cannon> cannons) {
        this.cannons = cannons;
    }

    public List<Cannon> loadAll() {
        for (Cannon load : cannons) {
            load.fire();
        }
        return cannons;
    }

    public void printLoaded(List<Cannon> cannons) {
        for (Cannon load : cannons) {
            if (load.getLoaded()) {
                System.out.println("Armata " + load.getName() + " została załadowana!");
            }
        }
    }
}
