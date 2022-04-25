package module1.excercise13;

public class Knight {

    private Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public String finishMission() {
        return "You succesfully finished mission: " + this.quest.process();
    }
}
