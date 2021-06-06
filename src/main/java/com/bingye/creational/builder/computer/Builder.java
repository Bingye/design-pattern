package com.bingye.creational.builder.computer;

abstract class Builder {

    protected Computer com = new Computer();

    abstract Builder buildCpu();

    abstract Builder buildBoard();

    abstract Builder buildMemory();

    abstract Builder buildDisk();

    abstract Builder buildGraphics();

    abstract Builder buildBox();

    public Computer build(){
        return com;
    }
}
