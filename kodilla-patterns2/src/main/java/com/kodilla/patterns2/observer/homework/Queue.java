package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Queue implements Backlog{
    private final String studentName;
    private final List<Watcher> watchers;
    private final List<Exercise> exercises;

    public Queue(String studentName) {
        this.studentName = studentName;
        watchers = new ArrayList<>();
        exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
        notifyWatchers();
    }

    public void notifyWatchers() {
        for(Watcher watcher : watchers) {
            watcher.update(this);
        }
    }

    public void assignWatcher(Watcher watcher) {
        watchers.add(watcher);
    }

    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }
}
