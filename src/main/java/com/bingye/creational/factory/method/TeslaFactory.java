package com.bingye.creational.factory.method;

public class TeslaFactory extends CarFactory {
    @Override
    public ICar getCar() {
        return new TeslaCar();
    }
}
