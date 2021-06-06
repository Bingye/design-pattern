package com.bingye.creational.singleton;

import java.io.*;

/**
 * 有时在分布式系统中，我们需要在Singleton类中实现Serializable接口，以便我们可以将其状态存储在文件系统中，并在以后的某个时间点检索它。这是一个小的单例类，它也实现了Serializable接口。
 * 序列化单例类的问题在于，每当我们反序列化它时，它将创建该类的新实例。因此，它破坏了单例模式，从而克服了这种情况，我们需要做的所有工作都提供了readResolve()方法的实现。
 */
public class SerializedSingleton implements Serializable {

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        //之后，您会注意到两个实例的hashCode在测试程序中是相同的
        return getInstance();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }

}
