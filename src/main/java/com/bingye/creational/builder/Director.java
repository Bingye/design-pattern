package com.bingye.creational.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product build() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.build();
    }

}
