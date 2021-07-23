package com.kodilla.patterns2.observer.homework;

public class Mentor implements Watcher{
    private final String name;
    private int updatesQuantity;

    public Mentor(String name) {
        this.name = name;
    }

    public void update(Backlog backlog) {
        Queue queue = (Queue)backlog; // dopisane w trakcie rozmowy z mentorem
        System.out.println(name + ": There is new homework in queue belonging to: " + queue.getStudentName() +
                " (total: " + queue.getExercises().size() + " exercises)");
        updatesQuantity++;
    }

    public int getUpdatesQuantity() {
        return updatesQuantity;
    }

    public String getName() {
        return name;
    }
}
