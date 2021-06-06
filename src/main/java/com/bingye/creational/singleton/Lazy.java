package com.bingye.creational.singleton;

/**
 * 实现单例模式的惰性初始化方法在全局访问方法中创建实例。这是使用这种方法创建Singleton类的示例代码。
 * 上面的实现在单线程环境下可以很好地工作，但是对于多线程系统，如果多个线程同时位于if条件中，则可能导致问题。它将破坏单例模式，并且两个线程都将获得单例类的不同实例
 */
public class Lazy {

    //创建 SingleObject 的一个对象
    private static Lazy instance = null;

    //让构造函数为 private，这样该类就不会被实例化
    private Lazy(){}

    //获取唯一可用的对象
    public static Lazy getInstance(){
        if(instance==null){
            instance = new Lazy();
        }
        return instance;
    }
}
