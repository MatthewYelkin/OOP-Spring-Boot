package com.matthew.java.springboottest.model.shapes;

import com.matthew.java.springboottest.model.strategies.DrawStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape{
    protected String color = "black";
    private DrawStrategy drawStrategy;

    public Shape(DrawStrategy drawStrategy) {
        this.drawStrategy = drawStrategy;
    }

    public String draw() {
        return drawStrategy.draw(this);
    }
}
