package com.bingye.structural.adapter;

public class Adapter extends Netwire implements IUsbTransfer {

    @Override
    public void transfer() {
        System.out.println("开始转换器");
        super.connect();
    }
}
