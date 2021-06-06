package com.bingye.structural.composite;

public abstract class Node {

    protected String name;

    protected int level;
    /**
     * 添加
     */
    public void add(Node node){
        throw new UnsupportedOperationException();
    }

    /**
     * 删除
     * @param node
     */
    public void remove(Node node){
        throw new UnsupportedOperationException();
    }

    //打印所有子节点
    public abstract void print();

    public String getName() {
        return name;
    }

}
