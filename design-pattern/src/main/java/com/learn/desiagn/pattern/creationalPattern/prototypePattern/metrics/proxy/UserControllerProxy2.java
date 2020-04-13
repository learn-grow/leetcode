package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.MetricsCollector;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.RequestInfo;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.UserVo;

import java.util.Random;

/**
 * @author: lisy
 * @version: : UserControllerProxy2 , v0.1 2020年04月13日 5:04 下午
 * @remark: the UserControllerProxy2 is
 */
public class UserControllerProxy2 extends UserController {

    private MetricsCollector metricsCollector;

    public UserControllerProxy2(){
        this.metricsCollector = new MetricsCollector();
    }


    public UserVo login(String name , String password){
        long startTime = System.currentTimeMillis();
        UserVo vo = new UserVo(name , password , 1);
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(10)); //随机休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login",responseTime , startTime);
        metricsCollector.recordRequest(requestInfo);
        return vo;
    }

    public UserVo register(String name ,String password){
        long startTime = System.currentTimeMillis();
        UserVo vo = new UserVo(name , password , 30);
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();

        long resposeTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("register",resposeTime , startTime);
        metricsCollector.recordRequest(requestInfo);
        return vo;
    }

}
