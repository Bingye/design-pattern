package com.bingye.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Square square = new Square();
        Color color = new Yellow(square);
        color.draw();

        Circle circle = new Circle();
        color = new Yellow(circle);
        color.draw();
    }

}
