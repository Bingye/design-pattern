package com.bingye.structural.proxy;

public class People implements Animal {
    @Override
    public void say() {
        System.out.println("人在说话");
    }
}
