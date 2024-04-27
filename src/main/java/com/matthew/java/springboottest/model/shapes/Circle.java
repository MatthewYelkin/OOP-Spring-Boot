package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.CircleDrawStrategy;

public class Circle extends Ellipse {
    public Circle(Point centre, double radius) {
        super(centre, radius, radius);
        setDrawStrategy(new CircleDrawStrategy());
    }

    public Circle(Point centre, double radius, String color) {
        this(centre, radius);
        setColor(color);
    }
}
