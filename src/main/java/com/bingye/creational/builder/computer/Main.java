package com.bingye.creational.builder.computer;

public class Main {

    public static void main(String[] args) {

        //创建建造者
        Builder builder = new ComputerBuilder();
        Computer build = builder.buildCpu().buildBoard().build();
        System.out.println(build.toString());

    }

}
