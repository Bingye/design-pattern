package com.bingye.structural.decorator;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import lombok.Data;

@Data
public abstract class FastFood {

    private float price;

    private String desc;

    abstract float cost();

    public FastFood() {
    }

    protected FastFood(float price, String desc){
        this.price = price;
        this.desc = desc;
    }

}
