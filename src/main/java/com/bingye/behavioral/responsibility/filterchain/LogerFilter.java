package com.bingye.behavioral.responsibility.filterchain;

public class LogerFilter implements Filter {

    @Override
    public void doFilter(FilterChain chain) {
        System.out.println("日志拦截过滤");
        chain.doFilter();
    }
}
