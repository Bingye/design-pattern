package com.bingye.structural.decorator;

import lombok.Data;

public abstract class Garnish extends FastFood{

    private FastFood fastfood;

    protected FastFood getFastfood() {
        return fastfood;
    }

    public Garnish(FastFood fastfood, float price, String desc) {
        super(price,desc);
        this.fastfood = fastfood;
    }
}
