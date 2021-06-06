package com.bingye.creational.factory.simple;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CarFactory {

    private static Map<String,ICar> cars = new HashMap<String,ICar>();

    static{
        Properties properties = new Properties();
        InputStream resourceAsStream = Main.class.getClassLoader().getResourceAsStream("factory.properties");
        try {
            properties.load(resourceAsStream);
            Set<Object> objects = properties.keySet();
            objects.forEach(key -> {
                String value = (String) properties.get(key);
                try {
                    Class<?> clazz = Class.forName(value);
                    ICar car = (ICar) clazz.newInstance();
                    cars.put((String) key,car);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(resourceAsStream!=null){
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ICar getCar(String car){
        return cars.get(car);
    }

}
