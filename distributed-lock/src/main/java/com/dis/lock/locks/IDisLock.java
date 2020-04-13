package com.dis.lock.locks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: lisy
 * @version: : DisLock , v0.1 2020年04月12日 2:51 下午
 * @remark: the DisLock is
 */
public interface IDisLock extends AutoCloseable  {

    public static Logger logger = LoggerFactory.getLogger(IDisLock.class);

    /**
     * 获取锁
     * @param ttl 过期时间 - 毫秒
     * @return true-获取锁，false-未获得锁
     * @throws RuntimeException 操作锁失败，需要业务判断是否重试
     */
    boolean lock(int ttl) throws RuntimeException;

    /**
     * 释放锁
     */
    default void unlock(){
        close();
    }

    /**
     * 竞争锁，并自动续租
     * @param ttl 过期时间，毫秒
     * @return true-获取锁，false-未获得锁
     * @throws RuntimeException
     */
    default boolean acquire(int ttl)
            throws RuntimeException {
        if (lock(ttl)) {
            logger.info("acquire _startHeartThread get lock ");
            _startHeartThread();
            return true;
        }
        return false;
    }

    /**
     * 等待锁
     * @param ttl 过期时间 毫秒
     * @param waitTime 等待时间 毫秒
     * @return
     * @throws RuntimeException
     */
    default boolean acquireOrWait(int ttl, int waitTime) throws RuntimeException {
        while (!lock(ttl)) {
            waitTime = waitTime - ttl / 3;
            try {
                Thread.sleep(ttl / 3);
            } catch (InterruptedException e) {
                logger.warn("等待锁,休眠异常{}" , e);
            }
            if (waitTime <= 0) {
                return false;
            }
        }
        logger.info("acquireOrWait _startHeartThread get lock ");
        _startHeartThread();
        return true;
    }
    /**
     * 自动续租
     */
    void _startHeartThread();

    /**
     * 释放锁
     */
    @Override
    void close();

}
