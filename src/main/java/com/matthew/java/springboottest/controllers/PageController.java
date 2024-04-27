package com.matthew.java.springboottest.controllers;

import com.matthew.java.springboottest.model.shapes.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Component
@Controller
public class PageController {
    private final ShapeList shapeList;

    public PageController(ShapeList shapeList) {
        this.shapeList = shapeList;

        shapeList.addShape(new Circle(new Point(100, 100), 10));
        shapeList.addShape(new Polyline(Arrays.asList(new Point(1, 5), new Point(70, 120), new Point(15, 50)), "none"));
        shapeList.addShape(new Triangle(new Point(250, 250), new Point(300, 300), new Point(300, 270)));
        shapeList.addShape(new Ellipse(new Point(150, 200), 50, 100));
        shapeList.addShape(new Square(new Point(50, 300), 50, "blue"));
        shapeList.addShape(new Line(new Point(20, 100), new Point(100, 20)));
        shapeList.addShape(new Rectangle(new Point(400, 400), 100, 200, "red"));
    }

    @GetMapping
    public String MyPaint(Model model) {
        model.addAttribute("shape_list", shapeList.drawList());

        return "hello";
    }
}
