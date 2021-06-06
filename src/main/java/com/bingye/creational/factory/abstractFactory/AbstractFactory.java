package com.bingye.creational.factory.abstractFactory;

public interface AbstractFactory {

    //生产手机
    IPhone getPhone();

    //生产路由器
    IRouter getRouter();
}
