package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCounter;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(mentorName + ": New task to check from " + taskQueue.getStudentName() +
                " (total: " + taskQueue.getTasks().size() + " tasks to check)");
        updateCounter++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCounter() {
        return updateCounter;
    }
}
