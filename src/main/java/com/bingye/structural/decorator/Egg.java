package com.bingye.structural.decorator;

public class Egg extends Garnish {

    public Egg(FastFood fastfood) {
        super(fastfood, 1f, "鸡蛋");
    }

    @Override
    float cost() {
       return super.getPrice()+super.getFastfood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+"+"+super.getFastfood().getDesc();
    }
}
