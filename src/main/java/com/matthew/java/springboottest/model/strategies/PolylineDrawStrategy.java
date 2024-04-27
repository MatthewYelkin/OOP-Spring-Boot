package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Point;
import com.matthew.java.springboottest.model.shapes.Polygon;
import com.matthew.java.springboottest.model.shapes.Polyline;
import com.matthew.java.springboottest.model.shapes.Shape;

public class PolylineDrawStrategy implements DrawStrategy {
    @Override
    public String draw(Shape shape) {
        if (shape.getClass() != Polyline.class)
            throw new RuntimeException();
        Polyline polyline = (Polyline) shape;
        StringBuilder svg = new StringBuilder("<polyline stroke-width=\"1\" stroke=\"black\" fill=\"" + polyline.getColor() + "\" points=\"");
        for (Point point: polyline.getPoints())
            svg.append(" ").append(point.getX()).append(",").append(point.getY());
        return svg.append("\" />").toString();
    }
}
