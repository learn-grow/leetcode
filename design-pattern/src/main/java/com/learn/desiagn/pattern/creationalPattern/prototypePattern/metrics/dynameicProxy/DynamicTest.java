package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.dynameicProxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy.IUserController;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy.UserController;

import java.lang.reflect.Proxy;

/**
 * @author: lisy
 * @version: : DynamicTest , v0.1 2020年04月13日 5:56 下午
 * @remark: the DynamicTest is
 */
public class DynamicTest {

    public static void main(String[] args) {
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController) proxy.createProxy(new UserController());
        userController.login("a","a");
        userController.register("b","b");
    }
}
