package com.bingye.creational.builder.computer;

public class ComputerBuilder extends Builder {

    @Override
    Builder buildCpu() {
        com.setCpu("M1");
        return this;
    }

    @Override
    Builder buildBoard() {
        com.setBoard("苹果主板");
        return this;
    }

    @Override
    Builder buildMemory() {
        com.setMemory("16G");
        return this;
    }

    @Override
    Builder buildDisk() {
        com.setDisk("1000G");
        return this;
    }

    @Override
    Builder buildGraphics() {
        com.setGraphics("INVIDA");
        return this;
    }

    @Override
    Builder buildBox() {
        com.setBox("山寨");
        return this;
    }
}
