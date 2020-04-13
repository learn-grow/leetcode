package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.MetricsCollector;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.RequestInfo;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.UserVo;

/**
 * @author: lisy
 * @version: : UserControllerProxy , v0.1 2020年04月13日 4:57 下午
 * @remark: the UserControllerProxy is
 */
public class UserControllerProxy implements IUserController {

    private MetricsCollector metricsCollector = new MetricsCollector();
    private UserController userController;

    public UserControllerProxy(UserController userController){
        this.userController = userController;
    }

    @Override
    public UserVo login(String name, String password) {
        long startTime = System.currentTimeMillis();
        UserVo vo = userController.login(name , password);
        long endTime = System.currentTimeMillis();
        long reponseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login",reponseTime , startTime);
        metricsCollector.recordRequest(requestInfo);
        return vo;
    }

    @Override
    public UserVo register(String name, String password) {
        long startTime = System.currentTimeMillis();
        UserVo vo = userController.register(name , password);
        long endTime = System.currentTimeMillis();
        long reponseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login",reponseTime , startTime);
        metricsCollector.recordRequest(requestInfo);
        return vo;
    }
}
