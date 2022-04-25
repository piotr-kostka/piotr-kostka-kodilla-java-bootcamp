package module1.excercise26;

import java.util.HashMap;
import java.util.Map;

public class MapProcessor {
    private HashMap<Student, StudentDegrees> studentsDegrees;

    public MapProcessor(HashMap<Student, StudentDegrees> studentsDegrees) {
        this.studentsDegrees = studentsDegrees;
    }

    public void printAverage(HashMap<Student, StudentDegrees> studentsDegrees) {

        for(Map.Entry<Student, StudentDegrees> entry : studentsDegrees.entrySet()) {
            System.out.println("Średnia ocen dla ucznia: " + entry.getKey() + " : " + entry.getValue().average());
        }
    }
}
