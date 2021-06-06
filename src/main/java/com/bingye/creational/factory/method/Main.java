package com.bingye.creational.factory.method;

public class Main {

    public static void main(String[] args) {
        CarFactory factory = new TeslaFactory();
        ICar teslaCar = factory.getCar();
        teslaCar.name();

        factory = new TeslaFactory();
        ICar wulingCar = factory.getCar();
        wulingCar.name();

        //这是新增一个摩拜单车
        factory = new TeslaFactory();
        ICar mobileCar = factory.getCar();
        mobileCar.name();

        //TODO 增加一百个种类的单车，需要新增一百个工厂类，复杂

        //结构复杂度 简单工厂
        //代码复杂度 简单工厂
        //管理复杂度 简单工厂

        //根据设计原则 工厂方法模式
        //根据实际使用 简单工厂模式
    }

}
