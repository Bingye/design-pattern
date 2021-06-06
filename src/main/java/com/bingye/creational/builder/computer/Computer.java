package com.bingye.creational.builder.computer;

public class Computer {

    String cpu;

    String board;

    String memory;

    String disk;

    String graphics;

    String box;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", board='" + board + '\'' +
                ", memory='" + memory + '\'' +
                ", disk='" + disk + '\'' +
                ", graphics='" + graphics + '\'' +
                ", box='" + box + '\'' +
                '}';
    }
}
