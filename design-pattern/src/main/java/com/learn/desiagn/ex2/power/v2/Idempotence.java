package com.learn.desiagn.ex2.power.v2;

/**
 * @author: lisy
 * @version: : Idempotence , v0.1 2020年08月19日 11:00 上午
 * @remark: the Idempotence is 一个简单的幂等号验证框架
 */
public class Idempotence {

    private IdempotenceStorage storage;

    public Idempotence(IdempotenceStorage storage){
        this.storage = storage;
    }

    public boolean saveIfAbsent(String id){
        return this.storage.saveIfAbsent(id);
    }

    public void delete(String id){
        this.storage.delete(id);
    }
}
