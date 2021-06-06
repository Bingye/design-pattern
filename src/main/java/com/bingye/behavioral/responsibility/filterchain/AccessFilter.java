package com.bingye.behavioral.responsibility.filterchain;

public class AccessFilter implements Filter {

    @Override
    public void doFilter(FilterChain chain) {
        System.out.println("访问过滤");
        chain.doFilter();
    }
}
