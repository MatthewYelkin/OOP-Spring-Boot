package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.RectangleDrawStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape{
    protected Point centre;
    protected double width;
    protected double height;

    public Rectangle(Point centre, int width, int height) {
        super(new RectangleDrawStrategy());
        this.centre = centre;
        this.width = width;
        this.height =height;
    }

    public Rectangle(Point centre, int width, int height, String color) {
        this(centre, width, height);
        this.color = color;
    }
}