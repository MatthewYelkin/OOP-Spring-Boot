package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Point;
import com.matthew.java.springboottest.model.shapes.Polygon;
import com.matthew.java.springboottest.model.shapes.Shape;

public class PolygonDrawStrategy implements DrawStrategy {
    @Override
    public String draw(Shape shape) {
        if (!Polygon.class.isAssignableFrom(shape.getClass()))
            throw new RuntimeException();
        Polygon polygon = (Polygon) shape;
        StringBuilder svg = new StringBuilder("<polygon fill=\"" + polygon.getColor() + "\" points=\"");
        for (Point point: polygon.getPoints())
            svg.append(" ").append(point.getX()).append(",").append(point.getY());
        return svg.append("\" />").toString();
    }
}
