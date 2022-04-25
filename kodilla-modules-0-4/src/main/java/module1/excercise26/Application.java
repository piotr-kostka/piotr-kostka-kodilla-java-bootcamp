package module1.excercise26;

import java.util.HashMap;

public class Application {
    public static void main (String[] args) throws java.lang.Exception {

        HashMap<Student, StudentDegrees> studentsDegrees = new HashMap<>(initStudents());

        MapProcessor processor = new MapProcessor(initStudents());
        processor.printAverage(studentsDegrees);

    }

    private static HashMap<Student, StudentDegrees> initStudents() {

        HashMap<Student, StudentDegrees> studentsDegrees = new HashMap<Student, StudentDegrees>();

        studentsDegrees.put(new Student("Jan", "Kowalski", "96053111223"), new StudentDegrees(5, 5, 3, 6, 3));
        studentsDegrees.put(new Student("Andrzej", "Nowak", "78041143211"), new StudentDegrees(3, 6, 5, 4, 5));
        studentsDegrees.put(new Student("Piotr", "Smith", "96093056876"), new StudentDegrees(5, 3, 2, 3, 3));
        studentsDegrees.put(new Student("Magda", "Janik", "98112324436"), new StudentDegrees(3, 3, 1, 2, 4));
        studentsDegrees.put(new Student("Agata", "Nowak", "99061509432"), new StudentDegrees(1, 4, 2, 5, 2));

        return studentsDegrees;
    }
}
