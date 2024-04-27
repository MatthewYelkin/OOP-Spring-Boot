package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Line;
import com.matthew.java.springboottest.model.shapes.Shape;

public class LineDrawStrategy implements DrawStrategy {
    @Override
    public String draw(Shape shape) {
        if (shape.getClass() != Line.class)
            throw new RuntimeException();
        Line line = (Line) shape;
        return "<line x1=\"" + line.getP1().getX() + "\" y1=\"" + line.getP1().getY() + "\" x2=\"" + line.getP2().getX() + "\" y2=\"" + line.getP2().getY() + "\" stroke=\"black\" />";
    }
}
