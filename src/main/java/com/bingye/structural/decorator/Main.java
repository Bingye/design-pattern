package com.bingye.structural.decorator;

public class Main {

    public static void main(String[] args) {

        //定一份炒饭
        FastFood fastFood = new FriedFood();
        System.out.println(fastFood.getDesc()+"  "+fastFood.cost()+"元");

        System.out.println("************************");

        //在上面的米饭中加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+"  "+fastFood.cost()+"元");

        //在上面的米饭中加一个鸡蛋
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+"  "+fastFood.cost()+"元");

    }

}
