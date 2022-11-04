package module4.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculations {

    public double calculateBestAverage(Map<Student, Grades> scores) {

        double max = 0;

        for(Map.Entry<Student, Grades> entry: scores.entrySet()) {
            if (entry.getValue().getTotalAvg() > max) {
                max = entry.getValue().getTotalAvg();
            }
        }
        return max;
    }

    public List<String> findStudentsNamesWithBestAverage(Map<Student, Grades> scores) {
        List<String> result = new ArrayList<>();
        double bestAverage = calculateBestAverage(scores);

        for(Map.Entry<Student,Grades> entry : scores.entrySet()) {
            if (entry.getValue().getTotalAvg() == bestAverage) {
                result.add(entry.getKey().getFullName());
            }
        }

        return result;
    }

    public List<Student> findStudentsWhichSpeakPolishWithAverageFromMathAbove4(Map<Student, Grades> scores) {
        List<Student> resultList = new ArrayList<>();

        for(Map.Entry<Student, Grades> entry: scores.entrySet()) {
            if (entry.getKey().getLanguage() == null) {
                continue;
            } else if (entry.getKey().getLanguage().equals("PL") && entry.getValue().getTotalAvg() > 4.0) {
                    resultList.add(entry.getKey());
            }
        }
        return resultList;
    }

}
