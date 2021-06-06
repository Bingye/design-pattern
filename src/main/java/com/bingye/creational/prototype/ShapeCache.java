package com.bingye.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<String,Shape> shapeCaches = new HashMap();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeCaches.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void initCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        rectangle.setType("Rectangle");
        shapeCaches.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("2");
        square.setType("Square");
        shapeCaches.put(square.getId(),square);
    }
}
