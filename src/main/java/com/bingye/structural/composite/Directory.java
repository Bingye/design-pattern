package com.bingye.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Node {

    private List<Node> list = new ArrayList<>();

    public Directory(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(Node node) {
        list.add(node);
    }

    @Override
    public void remove(Node node) {
        list.remove(node);
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public void print() {
        for (int i = 0; i < this.level; i++) {
            System.out.print("--");
        }
        System.out.println(this.name+":"+this.level);
        list.forEach(item -> {
            item.print();
        });
    }
}
