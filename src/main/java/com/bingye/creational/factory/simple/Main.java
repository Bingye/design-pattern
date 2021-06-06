package com.bingye.creational.factory.simple;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
//        ICar 特斯拉 = CarFactory.getCar("特斯拉");
//        特斯拉.name();
//
//        ICar 五菱 = CarFactory.getCar("五菱");
//        五菱.name();
        
        //静态工厂+本地配置解决实际工厂生产问题
        ICar car = CarFactory.getCar("tesla");
        car.name();

    }

}
