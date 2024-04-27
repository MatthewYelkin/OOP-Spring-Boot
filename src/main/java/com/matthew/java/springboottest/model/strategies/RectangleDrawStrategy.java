package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Rectangle;
import com.matthew.java.springboottest.model.shapes.Shape;

public class RectangleDrawStrategy implements DrawStrategy {
    @Override
    public String draw(Shape shape) {
        if (!Rectangle.class.isAssignableFrom(shape.getClass()))
            throw new RuntimeException();
        Rectangle rectangle = (Rectangle) shape;
        return "<rect x=\"" + rectangle.getCentre().getX() + "\" y=\"" + rectangle.getCentre().getY() + "\" width=\"" + rectangle.getWidth() + "\" height=\"" + rectangle.getHeight() + "\" fill=\"" + rectangle.getColor() + "\"/>";
    }
}
