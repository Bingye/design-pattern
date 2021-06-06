package com.bingye.creational.factory.abstractFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class Main {

    private IPhone phone;

    private IRouter router;



    public Main(AbstractFactory factory){
        phone = factory.getPhone();
        router = factory.getRouter();
    }

    public static void main(String[] args) {

        //XiaomiFactory xiaomiFactory = new XiaomiFactory();
        AbstractFactory factory = new XiaomiFactory();
        Main app = new Main(factory);
        app.router.route();
        app.phone.call();

        //factory.showClass();
        //xiaomiFactory.showClass();
        //新增一个华为工厂
        //AbstractFactory factory = new HuaweiFactory();


    }

}
