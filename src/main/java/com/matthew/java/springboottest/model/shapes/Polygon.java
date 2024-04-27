package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.PolygonDrawStrategy;

import java.util.List;

public class Polygon extends Polyline {
    public Polygon(List<Point> points) {
        super(points);
        setDrawStrategy(new PolygonDrawStrategy());
    }

    public Polygon(List<Point> points, String color) {
        this(points);
        this.color = color;
    }
}