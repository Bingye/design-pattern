package com.bingye;

public class Main {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("");
        sb.append("sss");
        //sb = new StringBuffer("sasas");
        test(sb);
        System.out.println(sb.toString());

        Integer a = new Integer(100);
        Integer b = new Integer(100);
        System.out.println(a==b);
        a=128;
        b=128;

        System.out.println(a==b);

        Integer s = 10;
        test(s);
        System.out.println(s);
    }

    public static void test(StringBuffer sb){
        sb.append("2222");
    }

    public static void test(Integer a){
        a=100;
    }

}
