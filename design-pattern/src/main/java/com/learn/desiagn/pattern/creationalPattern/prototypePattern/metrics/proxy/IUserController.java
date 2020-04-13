package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.UserVo;

/**
 * @author: lisy
 * @version: : IUserController , v0.1 2020年04月13日 4:55 下午
 * @remark: the IUserController is
 */
public interface IUserController {

    UserVo login(String name , String password);

    UserVo register(String name , String password);

}
