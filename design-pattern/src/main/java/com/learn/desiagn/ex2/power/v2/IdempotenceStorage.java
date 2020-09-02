package com.learn.desiagn.ex2.power.v2;

/**
 * @author: lisy
 * @version: : IdempotenceStorage , v0.1 2020年08月19日 11:00 上午
 * @remark: the IdempotenceStorage is 幂等号读写接口
 */
public interface IdempotenceStorage {

    /**
     * 存储幂等号
     * @param id
     * @return
     */
    boolean saveIfAbsent(String id);

    /**
     * 删除幂等号
     * @param id
     */
    void delete(String id);

}
