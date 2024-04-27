package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.LineDrawStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Line extends Shape {
    private Point p1, p2;

    public Line(Point p1, Point p2) {
        super(new LineDrawStrategy());
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(Point p1, Point p2, String color) {
        this(p1, p2);
        this.color = color;
    }
}