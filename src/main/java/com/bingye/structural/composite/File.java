package com.bingye.structural.composite;

public class File extends Node {

    public File(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < this.level; i++) {
            System.out.print("--");
        }
        System.out.println(this.name+":"+this.level);
    }

}
