package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.PolylineDrawStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Polyline extends Shape {
    protected List<Point> points;

    public Polyline(List<Point> points) {
        super(new PolylineDrawStrategy());
        this.points = points;
    }

    public Polyline(List<Point> points, String color) {
        this(points);
        this.color = color;
    }
}
