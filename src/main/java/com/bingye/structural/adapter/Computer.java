package com.bingye.structural.adapter;

public class Computer {

    public void usbNet(AdapterPlus adapter){
        System.out.println("准备上网");
        adapter.transfer();
    }

}
