package com.learn.desiagn.pattern.behavioralPattern.pipeline.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: lisy
 * @version: : LogFilter , v0.1 2020年05月06日 4:00 下午
 * @remark: the LogFilter is servlet filter使用就是责任链的模式实现，可以灵活的扩展
 */
public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("拦截客户端发送来的请求");
        filterChain.doFilter(request , response);
        System.out.println("拦截发送给客户端的请求");
    }

    @Override
    public void destroy() {

    }
}
