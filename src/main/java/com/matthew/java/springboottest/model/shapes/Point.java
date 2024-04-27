package com.matthew.java.springboottest.model.shapes;

import lombok.Getter;

@Getter
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
