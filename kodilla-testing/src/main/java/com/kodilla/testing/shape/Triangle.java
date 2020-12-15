package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    String name = "Triangle";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getShapeName() { return name; }
    public float getShapeArea() { float area = 1; return area; }
}
