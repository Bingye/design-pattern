package com.bingye.creational.prototype;

public class Square extends Shape {

    public Square(){
        super.setType("Square");
    }

    @Override
    void draw() {
        System.out.println("正方形");
    }
}
