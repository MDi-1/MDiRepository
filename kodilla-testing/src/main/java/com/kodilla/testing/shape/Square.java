package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String name = "Square";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getShapeName() {
        return name;
    }

    public float getShapeArea() {
        float area = 1;
        return area;
    }
}
