package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass, String task, String parameter1, String parameter2) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask(task, parameter1, parameter2);
            case PAINTING:
                return new PaintingTask(task, parameter1, parameter2);
            case SHOPPING:
                return new ShoppingTask(task, parameter1, Double.valueOf(parameter2));
            default:
                return null;
        }
    }
}
