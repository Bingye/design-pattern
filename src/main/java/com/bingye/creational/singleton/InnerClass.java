package com.bingye.creational.singleton;

/**
 * 在Java 5之前，Java内存模型存在很多问题，并且上述方法在某些情况下会失败，在某些情况下，太多的线程试图同时获取Singleton类的实例。因此，比尔·普格（Bill Pugh）提出了另一种方法，该方法使用内部静态帮助程序类创建Singleton类。Bill Pugh Singleton的实现是这样的；
 * 注意包含内部单例类实例的私有内部静态类。加载singleton类时，SingletonHelper该类不会加载到内存中，只有当有人调用getInstance方法时，该类才会加载并创建Singleton类实例。
 * 这是Singleton类使用最广泛的方法，因为它不需要同步。我在许多项目中都使用了这种方法，而且也很容易理解和实现。
 */
public class InnerClass {

    private InnerClass(){
    }

    static class SingletonHeler{
        private static InnerClass instance = new InnerClass();
    }

    public static InnerClass getInstance(){
        return SingletonHeler.instance;
    }
}
