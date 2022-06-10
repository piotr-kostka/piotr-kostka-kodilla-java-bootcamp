package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Hel", "car");
            case PAINTING:
                return new PaintingTask("Painting", "blue", "car");
            case SHOPPING:
                return new ShoppingTask("Shopping", "bread", 2);
            default:
                return null;
        }
    }
}
