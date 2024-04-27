package com.matthew.java.springboottest.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthew.java.springboottest.model.shapes.ShapeList;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class ShapeController {
    private final ShapeList shapeList;

    public ShapeController(ShapeList shapeList) {
        this.shapeList = shapeList;
    }

    @SneakyThrows
    @PostMapping("/add")
    public int saveShape(@RequestBody() String svgShape) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(svgShape);

        shapeList.addSvgShapes(jsonNode.get("svg").asText());
        return 200;
    }

    @PostMapping("/reset")
    public int resetShapes() {
        shapeList.clear();
        return 200;
    }
}