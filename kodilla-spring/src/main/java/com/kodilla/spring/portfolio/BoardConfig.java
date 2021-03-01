package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(makeToDoList(), makeInProgressList(), makeDoneList());
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList makeToDoList() {
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList makeInProgressList() {
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList makeDoneList() {
        return new TaskList();
    }

}
