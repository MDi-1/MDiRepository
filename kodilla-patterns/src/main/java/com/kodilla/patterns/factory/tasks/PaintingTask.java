package com.kodilla.patterns.factory.tasks;

public class PaintingTask extends ParentTask implements Task {
    String color;
    String whatToPaint;


    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        taskExecuted = true;
        return whatToPaint + " has been " + taskName + "ed " + color;
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
