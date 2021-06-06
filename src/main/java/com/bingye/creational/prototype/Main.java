package com.bingye.creational.prototype;

public class Main implements Cloneable{

    public static void main(String[] args) {
        ShapeCache.initCache();

        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape);

        Shape shape1 = ShapeCache.getShape("2");
        System.out.println(shape1);
    }

}
