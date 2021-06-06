package com.bingye.structural.bridge;

public class Yellow extends Color {

    public Yellow(Shape shape) {
        super(shape);
    }

    @Override
    void draw() {
        System.out.println("黄色的");
        shape.draw();
    }
}
