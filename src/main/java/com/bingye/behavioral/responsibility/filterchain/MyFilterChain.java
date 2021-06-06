package com.bingye.behavioral.responsibility.filterchain;

import java.util.ArrayList;
import java.util.List;

public class MyFilterChain implements FilterChain {

    private static List<Filter> additionalFilters = new ArrayList<>();
    private int currentPosition = 0;

    @Override
    public FilterChain addFilter(Filter filter){
        additionalFilters.add(filter);
        return this;
    }

    @Override
    public void doFilter() {
        if (this.currentPosition == this.additionalFilters.size()) {
            System.out.println("过滤链执行完毕");
        }else{
            ++this.currentPosition;
            this.additionalFilters.get(this.currentPosition - 1).doFilter(this);
        }
    }
}
