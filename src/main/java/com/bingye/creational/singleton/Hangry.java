package com.bingye.creational.singleton;

/**
 * 在急切的初始化中，在加载类时会创建Singleton类的实例，这是创建Singleton类的最简单方法，但是它具有缺点，即使客户端应用程序可能不使用它，该实例也会被创建。
 * 如果您的单例类没有使用大量资源，则可以使用这种方法。但是在大多数情况下，都是为文件系统，数据库连接等资源创建Singleton类的getInstance。除非客户端调用该方法，否则应避免实例化。另外，此方法不提供任何用于异常处理的选项。
 */
public class Hangry {

    //创建 SingleObject 的一个对象
    private static Hangry instance = new Hangry();

    //让构造函数为 private，这样该类就不会被实例化
    private Hangry(){}

    //获取唯一可用的对象
    public static Hangry getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
