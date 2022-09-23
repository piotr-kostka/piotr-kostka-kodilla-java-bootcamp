package com.kodilla.patterns2.observer.homework;

import java.util.HashSet;
import java.util.Set;

public class TaskQueue implements Observable{
    private final Set<Observer> observers;
    private final Set<String> tasks;
    private final String studentName;

    public TaskQueue(String studentName) {
        observers = new HashSet<>();
        tasks = new HashSet<>();
        this.studentName = studentName;
    }

    public void sendTaskToCheck(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Set<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
