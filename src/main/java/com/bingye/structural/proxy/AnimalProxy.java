package com.bingye.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalProxy implements InvocationHandler {

    Animal animal = new People();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前");
        Object invoke = method.invoke(animal, args);
        System.out.println("执行后");
        return invoke;
    }
}
