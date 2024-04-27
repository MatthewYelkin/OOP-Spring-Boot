package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Circle;
import com.matthew.java.springboottest.model.shapes.Ellipse;
import com.matthew.java.springboottest.model.shapes.Shape;

public class CircleDrawStrategy implements DrawStrategy{
    @Override
    public String draw(Shape shape) {
        if (shape.getClass() != Circle.class) {
            throw new RuntimeException();
        }
        Circle circle = (Circle) shape;
        return "<circle fill=\"" + circle.getColor() + "\" cx=\"" + circle.getCentre().getX() + "\" cy=\"" + circle.getCentre().getY() + "\" r=\"" + circle.getWidth() + "\"/>";
    }
}
