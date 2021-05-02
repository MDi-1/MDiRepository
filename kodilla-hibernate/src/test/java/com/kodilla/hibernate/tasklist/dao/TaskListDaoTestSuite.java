package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "example name of the list";
    private static final String DESCRIPTION = "example description of the list";

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList(5, NAME, DESCRIPTION);
        taskListDao.save(taskList);
        //when
        List<TaskList> readLists = taskListDao.findByListName(NAME);

        //then
        String result = readLists.get(0).getDescription();
        System.out.println("\n]]]] Kodilla exercise 15.4 TaskFactory [[[[");
        System.out.println("Result description is= " + result +"\n");

        assertEquals("example description of the list", result);
        //cleanup
        taskListDao.deleteById(5);
    }
}
