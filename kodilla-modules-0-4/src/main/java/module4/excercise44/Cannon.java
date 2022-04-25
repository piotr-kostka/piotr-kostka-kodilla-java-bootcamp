package module4.excercise44;

public class Cannon {

    private String name;
    public boolean loaded;

    public Cannon (String name, boolean loaded) {
        this.name = name;
        this.loaded = loaded;
    }

    public String getName() {
        return name;
    }

    public boolean getLoaded() {
        return loaded;
    }

    public boolean fire() {
        if (loaded == false) {
            System.out.println("Brak kul w: " + name + " - Trwa ładowanie...");
            loaded = true;
        }
        return loaded;
    }
}
