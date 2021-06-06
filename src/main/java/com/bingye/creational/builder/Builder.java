package com.bingye.creational.builder;

abstract class Builder {

    protected Product product = new Product();

    abstract void buildPartA();

    abstract void buildPartB();

    abstract void buildPartC();

    public Product build(){
        return product;
    }

}
