package com.bingye.creational.singleton;

/**
 * 静态块初始化的实现与热切初始化类似，不同的是，类的实例是在提供了异常处理选项的静态块中创建的
 * 急切的初始化和静态块初始化都在创建实例之前就创建了实例，这不是最佳实践。因此，在进一步的章节中，我们将学习如何创建支持延迟初始化的Singleton类。
 */
public class HangryStaticBlock {

    private static HangryStaticBlock instance = null;

    static {
        try{
            instance = new HangryStaticBlock();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    //让构造函数为 private，这样该类就不会被实例化
    private HangryStaticBlock(){}

    //获取唯一可用的对象
    public static HangryStaticBlock getInstance(){
        return instance;
    }

}
