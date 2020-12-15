package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();
    public  void  addFigure(Shape shape) { figures.add(shape); }
    public  void  remFigure(Shape shape) { figures.remove(shape); }
    public Shape  getFigure(int n)       {
        Shape shape = figures.get(n);
        System.out.println("shape got from the list is: " + shape.getShapeName());
        return shape;
    }
    public String showFigures() {
        String line = "";
        for (Shape shape : figures) {
            line = line + shape.getShapeName() + " ";
        } return line;
    } public int getShapesQuantity() { return figures.size(); }
}
