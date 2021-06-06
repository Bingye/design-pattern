package com.bingye.structural.adapter;

public class AdapterPlus implements IUsbTransfer {

    private Netwire netwire;

    public AdapterPlus(Netwire netwire){
        this.netwire = netwire;
    }

    @Override
    public void transfer() {
        System.out.println("开始转换器");
        netwire.connect();
    }
}
