package com.learn.desiagn.pattern.behavioralPattern.pipeline.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: lisy
 * @version: : LogInterceptor , v0.1 2020年05月06日 4:16 下午
 * @remark: the LogInterceptor is
 */
public class LogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截客户端发送来的请求");
        return true; //继续后续的处理
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截发送给客户端的请求");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("这里总是被执行到的");
    }

    //在Spring MVC配置文件中配置interceptors
//    <mvc:interceptors>
//        <mvc:interceptor>
//        <mvc:mapping path="/*"/>
//            <bean class="com.learn.desiagn.pattern.behavioralPattern.pipeline.filter.LogInterceptor" />
//        </mvc:interceptor>
//    </mvc:interceptors>
}
