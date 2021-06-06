package com.bingye.creational.builder;

public class ConcreteBuilder extends Builder {

    @Override
    void buildPartA() {
        product.setPartA("部分A");
    }

    @Override
    void buildPartB() {
        product.setPartB("部分B");
    }

    @Override
    void buildPartC() {
        product.setPartB("部分C");
    }

}
