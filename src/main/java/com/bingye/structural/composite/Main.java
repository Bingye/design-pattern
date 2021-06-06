package com.bingye.structural.composite;

public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("文件夹",0);
        Directory d1 = new Directory("文件夹",1);

        d1.add(new File("文件",2));

        root.add(d1);

        root.add(new File("文件",1));

        root.print();
    }

    //透明组合模式 优先选择
    //安全组合模式

}
