package com.bingye.creational.prototype;


public class Rectangle extends Shape {

    public Rectangle(){
        super.setType("Rectangle");
    }


    @Override
    void draw() {
        System.out.println("长方形");
    }
}
