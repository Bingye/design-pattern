package com.bingye.creational.builder;

public class Main {

    public static void main(String[] args) {

        //Product 是一个复杂对象
        Builder builder = new ConcreteBuilder();
        builder.buildPartA();
        builder.buildPartB();
        Product product = builder.build();
        System.out.println(product);
    }

}
