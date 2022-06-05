package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        String toDo = "to do task";
        String inProgress = "in progress task";
        String done = "done task";

        board.getToDoList().addTask(toDo);
        board.getInProgressList().addTask(inProgress);
        board.getDoneList().addTask(done);

        //When
        String task1 = board.getToDoList().getTasks().get(0);
        String task2 = board.getInProgressList().getTasks().get(0);
        String task3 = board.getDoneList().getTasks().get(0);

        //Then
        Assertions.assertEquals(toDo, task1);
        Assertions.assertEquals(inProgress, task2);
        Assertions.assertEquals(done, task3);
    }
}
