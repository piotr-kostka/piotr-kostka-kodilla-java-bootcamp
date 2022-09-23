package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Jan Nowak");
        Mentor mentor2 = new Mentor("Andrzej Kowalski");

        TaskQueue jessiePinkman = new TaskQueue("Jessie Pinkman");
        TaskQueue walterWhite = new TaskQueue("Walter White");
        TaskQueue saulGoodman = new TaskQueue("Saul Goodman");
        TaskQueue cristianoRonaldo = new TaskQueue("Cristiano Ronaldo");
        TaskQueue lionelMessi = new TaskQueue("Lionel Messi");

        jessiePinkman.registerObserver(mentor1);
        walterWhite.registerObserver(mentor2);
        saulGoodman.registerObserver(mentor1);
        cristianoRonaldo.registerObserver(mentor2);
        lionelMessi.registerObserver(mentor1);

        //When
        jessiePinkman.sendTaskToCheck("Task 1.1");
        jessiePinkman.sendTaskToCheck("Task 1.6");
        jessiePinkman.sendTaskToCheck("Task 2.1");
        walterWhite.sendTaskToCheck("Task 1.1");
        walterWhite.sendTaskToCheck("Task 1.3");
        saulGoodman.sendTaskToCheck("Task 1.2");
        cristianoRonaldo.sendTaskToCheck("Task 1.1");
        cristianoRonaldo.sendTaskToCheck("Task 1.2");
        lionelMessi.sendTaskToCheck("Task 1.2");
        lionelMessi.sendTaskToCheck("Task 1.6");
        lionelMessi.sendTaskToCheck("Task 2.1");

        //Then
        assertEquals(7, mentor1.getUpdateCounter());
        assertEquals(4, mentor2.getUpdateCounter());
    }
}
