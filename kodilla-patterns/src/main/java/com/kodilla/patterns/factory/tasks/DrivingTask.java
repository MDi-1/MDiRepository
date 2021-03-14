package com.kodilla.patterns.factory.tasks;

public class DrivingTask extends ParentTask implements Task {
    String where;
    String using;


    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        taskExecuted = true;
        return using + " and " + taskName + " to " + where;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}