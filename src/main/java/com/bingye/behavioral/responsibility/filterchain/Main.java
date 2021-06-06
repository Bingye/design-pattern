package com.bingye.behavioral.responsibility.filterchain;

public class Main {

    public static void main(String[] args) {

        MyFilterChain myFilterChain = new MyFilterChain();
        //生成一个登录过滤器
        myFilterChain.addFilter(new LoginFilter());
        //生成一个访问过滤器
        myFilterChain.addFilter(new AccessFilter());
        //生成一个日志过滤器
        myFilterChain.addFilter(new LogerFilter());

        myFilterChain.doFilter();
    }
}
