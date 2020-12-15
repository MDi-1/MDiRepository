package com.kodilla.testing.shape;

public interface Shape {
    String name = null;
//  default String getShapeName() { return Shape.name; }
    String getShapeName();
    float getShapeArea();
}