package com.bingye.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        final Animal people = new People();

        ((Animal) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("执行前");
                Object invoke = method.invoke(people, args);
                System.out.println("执行后");
                return invoke;
            }
        })).say();
    }

}
