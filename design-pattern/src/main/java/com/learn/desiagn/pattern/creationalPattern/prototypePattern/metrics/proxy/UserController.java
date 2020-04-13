package com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.proxy;

import com.learn.desiagn.pattern.creationalPattern.prototypePattern.metrics.entity.UserVo;

/**
 * @author: lisy
 * @version: : UserController , v0.1 2020年04月13日 4:56 下午
 * @remark: the UserController is
 */
public class UserController implements IUserController {

    @Override
    public UserVo login(String name, String password) {
        return new UserVo(name , password , 10);
    }

    @Override
    public UserVo register(String name, String password) {
        return new UserVo(name , password , 11);
    }
}
