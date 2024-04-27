package com.matthew.java.springboottest.model.shapes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Scope("singleton")
@Component
public class ShapeList {
    private final ArrayList<Shape> shapes;
    private final ArrayList<String> svgShapes;

    public ShapeList() {
        shapes = new ArrayList<>();
        svgShapes = new ArrayList<>();
    }

    public void addAllShape(List<Shape> shapes) {
        this.shapes.addAll(shapes);
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void addSvgShapes(String svgShape) {
        svgShapes.add(svgShape);
    }

    public void clear() {
        shapes.clear();
        svgShapes.clear();
    }

    public String drawList() {
        StringBuilder svg = new StringBuilder("<svg>");

        for (Shape shape: shapes)
            svg.append(shape.draw());
        for (String svgShape: svgShapes)
            svg.append(svgShape);
        svg.append("</svg>");

        return svg.toString();
    }
}