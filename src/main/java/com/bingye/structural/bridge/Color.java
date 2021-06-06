package com.bingye.structural.bridge;

//桥接类
public abstract class Color {

    protected Shape shape;

    public Color(Shape shape){
        this.shape = shape;
    }

    void showShape(){
        System.out.println(this.shape);
    }

    abstract void draw();

}
