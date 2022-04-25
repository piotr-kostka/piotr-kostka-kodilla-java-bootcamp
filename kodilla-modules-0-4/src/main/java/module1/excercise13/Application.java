package module1.excercise13;

public class Application {
    public static void main (String[] args) {

        Knight knight = new Knight(new EliteKnightQuest());
        String endedMission = knight.finishMission();

        System.out.println(endedMission);
    }
}
