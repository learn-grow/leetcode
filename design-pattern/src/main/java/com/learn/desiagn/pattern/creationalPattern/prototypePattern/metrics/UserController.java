package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.RequestInfo;
import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.UserVo;

import java.util.Random;

/**
 * @author: lisy
 * @version: : UserController , v0.1 2020年04月13日 10:48 上午
 * @remark: the UserController is
 */
public class UserController {

    /**监控信息**/
    private MetricsCollector metricsCollector = new MetricsCollector();

    public UserVo login(String name, String password) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        UserVo userVo = new UserVo();

        if (name.equals("li") && password.equals("li")){
            userVo = new UserVo(name , password , 30);
            Random random = new Random();
            Thread.sleep(random.nextInt(10)); //随机休眠10以内
        }
        long endTime = System.currentTimeMillis();
        long responseTime = endTime - startTime;
        RequestInfo requestInfo = new RequestInfo("login",startTime , endTime);
        metricsCollector.recordRequest(requestInfo);
        return userVo;
    }

    public UserVo register(String name , String password){
        long startTime = System.currentTimeMillis();
        /**业务处理**/

        long entTime = System.currentTimeMillis();
        long reponseTime = entTime - startTime;
        RequestInfo requestInfo = new RequestInfo("register", startTime, entTime);
        metricsCollector.recordRequest(requestInfo);

        return new UserVo("a","b",1);
    }

}
