package com.learn.desiagn.ex2.power.v2;

import java.util.UUID;

/**
 * @author: lisy
 * @version: : IdempotenceIdGenerator , v0.1 2020年08月19日 11:15 上午
 * @remark: the IdempotenceIdGenerator is 幂等号生成类
 */
public class IdempotenceIdGenerator {

    /**
     * 获取id
     * @return
     */
    public String generateId(){
        return UUID.randomUUID().toString();
    }
}
