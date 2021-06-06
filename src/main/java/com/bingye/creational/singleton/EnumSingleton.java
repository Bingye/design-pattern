package com.bingye.creational.singleton;

/**
 * 为了通过反射来克服这种情况，Joshua Bloch建议使用Enum来实现Singleton设计模式，因为Java确保在Java程序中仅将一次枚举值实例化一次。由于Java枚举值可全局访问，因此单例也是如此。缺点是枚举类型有些不灵活；例如，它不允许延迟初始化。
 */
public enum EnumSingleton {

    INSTANCE;

    public static void todo(){

    }

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }

}
