package com.learn.desiagn.pattern.behavioralPattern.pipeline.filter;


import javax.servlet.*;
import java.io.IOException;

import static org.apache.catalina.core.ApplicationFilterChain.INCREMENT;

/**
 * @author: lisy
 * @version: : ApplicationFilterChain , v0.1 2020年05月06日 4:04 下午
 * @remark: the ApplicationFilterChain is
 */
public class ApplicationFilterChain implements FilterChain {

    private int pos = 0; //当前执行到那个filter
    private int n ; //filter的个数
    private ApplicationFilterConfig[] filters;
    private Servlet servlet;


    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        if (pos < n){
            ApplicationFilterConfig filterConfig = filters[pos++];
            Filter filter = filterConfig.getFilter();
            filter.doFilter(request , response , this::doFilter);
        }else{
            servlet.service(request , response);
        }
    }

    public void addFilter(ApplicationFilterConfig config){
        for (ApplicationFilterConfig filter : filters) {
            if (filter == config)
                return;
            if (n == filters.length) {
                ApplicationFilterConfig[] newFilters = new ApplicationFilterConfig[n + INCREMENT];
                System.arraycopy(filters , 0 , newFilters, 0 , n);
                filters = newFilters;
            }
        }
    }
}
