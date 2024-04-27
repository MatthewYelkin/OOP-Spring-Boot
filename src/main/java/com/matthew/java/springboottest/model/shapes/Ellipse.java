package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.EllipseDrawStrategy;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ellipse extends Shape {
    protected Point centre;
    protected double height;
    protected double width;

    public Ellipse(Point centre, double height, double width) {
        super(new EllipseDrawStrategy());
        this.centre = centre;
        this.height = height;
        this.width = width;
    }

    public Ellipse(Point centre, double height, double width, String color) {
        this(centre, height, width);
        this.color = color;
    }
}
