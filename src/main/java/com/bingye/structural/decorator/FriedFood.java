package com.bingye.structural.decorator;

public class FriedFood extends FastFood{

    @Override
    float cost() {
        return super.getPrice();
    }

    public FriedFood() {
        super(10.5f, "炒饭");
    }
}
