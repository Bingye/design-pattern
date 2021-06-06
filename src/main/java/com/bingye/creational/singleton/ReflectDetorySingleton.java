package com.bingye.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * 反射可用于销毁所有上述单例实现方法
 * 当您运行上述测试类时，您会注意到两个实例的hashCode不相同，这会破坏单例模式。反射功能非常强大，并在许多框架（如Spring和Hibernate）中使用
 */
public class ReflectDetorySingleton {

    public static void main(String[] args) {
        LazySafe instanceOne = LazySafe.getInstance();
        LazySafe instanceTwo = null;
        try {
            Constructor[] constructors = LazySafe.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (LazySafe) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne);
        System.out.println(instanceTwo);
    }

}
