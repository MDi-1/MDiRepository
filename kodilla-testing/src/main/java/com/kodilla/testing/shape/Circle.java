package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    String name = "Circle";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getShapeName() { return name; }
    public float getShapeArea() { float area = 1; return area; }
}
