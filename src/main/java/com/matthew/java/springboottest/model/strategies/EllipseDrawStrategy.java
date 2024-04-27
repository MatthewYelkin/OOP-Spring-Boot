package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Ellipse;
import com.matthew.java.springboottest.model.shapes.Shape;

public class EllipseDrawStrategy implements DrawStrategy {
    @Override
    public String draw(Shape shape) {
        if (shape.getClass() != Ellipse.class) {
            throw new RuntimeException();
        }
        Ellipse ellipse = (Ellipse) shape;
        return "<ellipse fill=\"" + ellipse.getColor() + "\" cx=\"" + ellipse.getCentre().getX() + "\" cy=\"" + ellipse.getCentre().getY() + "\" rx=\"" + ellipse.getWidth() + "\" ry=\"" + ellipse.getHeight() + "\"/>";
    }
}
