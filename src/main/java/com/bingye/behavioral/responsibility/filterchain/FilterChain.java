package com.bingye.behavioral.responsibility.filterchain;

public interface FilterChain {

    void doFilter();

    FilterChain addFilter(Filter filter);

}
