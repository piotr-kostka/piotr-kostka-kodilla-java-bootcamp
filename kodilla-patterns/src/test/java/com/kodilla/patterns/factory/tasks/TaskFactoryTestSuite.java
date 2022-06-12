package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING, "Shopping", "bread", "2");
        boolean beforeExecuted = shopping.isTaskExecuted();
        shopping.executeTask();
        boolean afterExecuted = shopping.isTaskExecuted();
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertFalse(beforeExecuted);
        assertTrue(afterExecuted);
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING, "Painting", "blue", "car");
        boolean beforeExecuted = painting.isTaskExecuted();
        painting.executeTask();
        boolean afterExecuted = painting.isTaskExecuted();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertFalse(beforeExecuted);
        assertTrue(afterExecuted);
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING, "Driving", "Hel", "car");
        boolean beforeExecuted = driving.isTaskExecuted();
        driving.executeTask();
        boolean afterExecuted = driving.isTaskExecuted();
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertFalse(beforeExecuted);
        assertTrue(afterExecuted);
    }
}
