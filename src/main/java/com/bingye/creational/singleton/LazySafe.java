package com.bingye.creational.singleton;

public class LazySafe {

    //创建 SingleObject 的一个对象
    private static LazySafe instance = null;

    //让构造函数为 private，这样该类就不会被实例化
    private LazySafe(){}

    //获取唯一可用的对象
    public static LazySafe getInstance(){
        if(instance==null){
            synchronized (LazySafe.class){
                if(instance==null){
                    instance = new LazySafe();
                }
            }
        }
        return instance;
    }

    public static synchronized LazySafe getInstance2(){
        if(instance==null){
            instance = new LazySafe();
        }
        return instance;
    }
}
