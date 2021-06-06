package com.bingye.creational.factory.method;


public class MobileFactory extends CarFactory {
    @Override
    public ICar getCar() {
        return new MobileCar();
    }
}
