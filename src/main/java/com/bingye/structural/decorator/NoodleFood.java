package com.bingye.structural.decorator;

public class NoodleFood extends FastFood {

    @Override
    float cost() {
        return super.getPrice();
    }

    public NoodleFood() {
        super(5f, "炒面");
    }

}

