package com.bingye.creational.factory.abstractFactory;

public class XiaomiFactory implements AbstractFactory {
    @Override
    public IPhone getPhone() {
        //具体实现手机
        return new XiaomiPhone();
    }

    @Override
    public IRouter getRouter() {
        //具体实现路由
        return new XiaomiRouter();
    }

//    @Override
//    public void showClass() {
//        System.out.println("子类default覆盖");
//    }
}
