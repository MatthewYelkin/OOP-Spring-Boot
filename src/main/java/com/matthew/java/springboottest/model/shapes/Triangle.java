package com.matthew.java.springboottest.model.shapes;

import java.util.ArrayList;

public class Triangle extends Polygon {
    public Triangle(Point p1, Point p2, Point p3) {
        super(new ArrayList<>());
        points.add(p1);
        points.add(p2);
        points.add(p3);
    }

    public Triangle(Point p1, Point p2, Point p3, String color) {
        this(p1, p2, p3);
        this.color = color;
    }
}
