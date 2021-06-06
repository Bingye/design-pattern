package com.bingye.behavioral.responsibility.filterchain;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(FilterChain chain) {
        System.out.println("登录过滤");
        chain.doFilter();
    }
}
