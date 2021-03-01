package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        TaskList boardToDo = board.getToDoList();
        TaskList boardProgress = board.getInProgressList();
        TaskList boardDone = board.getDoneList();
        String a = "task abc", d = "task def", x = "task xyz";
        boardToDo.getTasks().add(a);
        boardProgress.getTasks().add(d);
        boardDone.getTasks().add(x);
        //Then
        assertEquals("task abc", boardToDo.getTasks().get(0));
        assertEquals("task def", boardProgress.getTasks().get(0));
        assertEquals("task xyz", boardDone.getTasks().get(0));
    }
}
