package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy;

/**
 * @author: lisy
 * @version: : ProxyDemoTest , v0.1 2020年04月13日 5:01 下午
 * @remark: the ProxyDemoTest is
 */
public class ProxyDemoTest {

    /**
     * 静态代理的使用
     * @param args
     */
    public static void main(String[] args) {
        /**
         * UserControllerProxy使用举例
         * 因为原始类和代理类实现相同的接口，是基于接口而非实现编程
         * 将UserController类对象替换为UserControllerProxy类对象，不需要改动太多代码
         */
        IUserController userController = new UserControllerProxy(new UserController());
        userController.login("a","b");
        userController.login("c","d");

        UserControllerProxy2 userControllerProxy2 = new UserControllerProxy2();
        userControllerProxy2.login("a2","b2");
        userControllerProxy2.register("c2","d2");


    }
}
