package com.matthew.java.springboottest.model.strategies;

import com.matthew.java.springboottest.model.shapes.Shape;

public interface DrawStrategy {
    String draw(Shape shape);
}
