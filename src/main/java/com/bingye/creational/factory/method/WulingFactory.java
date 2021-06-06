package com.bingye.creational.factory.method;

public class WulingFactory extends CarFactory {
    @Override
    public ICar getCar() {
        return new WulingCar();
    }
}
