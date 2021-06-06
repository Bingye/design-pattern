package com.bingye.structural.adapter;

public class Main {

    public static void main(String[] args) {
        //电脑通过usb转接口的适配器链接网线上网
        //声明一个电脑
        Computer computer = new Computer();
        //网线
        Netwire netwire = new Netwire();
        //网线插入适配器 ： 组合方式
        AdapterPlus adapter = new AdapterPlus(netwire);
        //适配器插入电脑
        computer.usbNet(adapter);

    }

}
