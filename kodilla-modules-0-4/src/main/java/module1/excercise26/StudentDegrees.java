package module1.excercise26;

public class StudentDegrees {
    private Integer mathDegree;
    private Integer ITDegree;
    private Integer englishDegree;
    private Integer polishDegree;
    private Integer physicsDegree;

    public StudentDegrees (Integer mathDegree, Integer ITDegree, Integer englishDegree, Integer polishDegree, Integer physicsDegree) {
        this.mathDegree = mathDegree;
        this.ITDegree = ITDegree;
        this.englishDegree = englishDegree;
        this.polishDegree = polishDegree;
        this.physicsDegree = physicsDegree;
    }

    public Integer getMathDegree() {
        return mathDegree;
    }

    public Integer getITDegree() {
        return ITDegree;
    }

    public Integer getEnglishDegree() {
        return englishDegree;
    }

    public Integer getPolishDegree() {
        return polishDegree;
    }

    public Integer getPhysicsDegree() {
        return physicsDegree;
    }

    public String toString() {
        return mathDegree + " " + ITDegree + " " + englishDegree + " " + polishDegree + " " + physicsDegree;
    }

    public Double average() {
        double result = mathDegree + ITDegree + englishDegree + polishDegree + physicsDegree;
        double average = result / 5;
        return average;
    }
}
