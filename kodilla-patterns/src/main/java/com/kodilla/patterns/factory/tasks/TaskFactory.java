package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task getTask(final String taskClass) {
        switch (taskClass) {
            case SHOP:
                return new ShoppingTask("just buy", "paint", 3.2);
            case PAINT:
                return new PaintingTask("paint", "white", "that wall");
            case DRIVE:
                return new DrivingTask("just drive", "that store", "take the truck");
            default:
                return null;
        }
    }
}
