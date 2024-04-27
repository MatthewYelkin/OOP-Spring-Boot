package com.matthew.java.springboottest.model.shapes;

public class Square extends Rectangle {
    public Square(Point centre, int width) {
        super(centre, width, width);
    }

    public Square(Point centre, int width, String color) {
        super(centre, width, width, color);
    }
}