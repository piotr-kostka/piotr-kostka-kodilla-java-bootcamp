package module4.test;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Integer> maths;
    private List<Integer> physics;
    private List<Integer> english;

    public Grades() {
        this.maths = new ArrayList<>();
        this.physics = new ArrayList<>();
        this.english = new ArrayList<>();
    }

    public Grades(List<Integer> maths, List<Integer> physics, List<Integer> english) {
        this.maths = maths;
        this.physics = physics;
        this.english = english;
    }

    public List<Integer> getMaths() {
        return new ArrayList<>(maths);
    }

    public List<Integer> getPhysics() {
        return new ArrayList<>(physics);
    }

    public List<Integer> getEnglish() {
        return new ArrayList<>(english);
    }

    public double getMathAvg() {
        double sum = 0;
        for (int i=0; i<getMaths().size(); i++) {
            sum += getMaths().get(i);
        }
        return sum / getMaths().size();
    }

    public double getPhysicsAvg() {
        double sum = 0;
        for (int i=0; i<getPhysics().size(); i++) {
            sum += getPhysics().get(i);
        }
        return sum / getPhysics().size();
    }

    public double getEnglishAvg() {
        double sum = 0;
        for (int i=0; i<getEnglish().size(); i++) {
            sum += getEnglish().get(i);
        }
        return sum / getEnglish().size();
    }

    public double getTotalAvg() {
        double totalAvg = getMathAvg() + getPhysicsAvg() + getEnglishAvg();
        return totalAvg / 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Grades grades = (Grades) o;

        if (maths != null ? !maths.equals(grades.maths) : grades.maths != null) {
            return false;
        }
        if (physics != null ? !physics.equals(grades.physics) : grades.physics != null) {
            return false;
        }
        return english != null ? english.equals(grades.english) : grades.english == null;
    }

    @Override
    public int hashCode() {
        int result = maths != null ? maths.hashCode() : 0;
        result = 31 * result + (physics != null ? physics.hashCode() : 0);
        result = 31 * result + (english != null ? english.hashCode() : 0);
        return result;
    }
}
