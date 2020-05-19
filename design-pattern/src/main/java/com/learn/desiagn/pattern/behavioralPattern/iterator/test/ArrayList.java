package com.learn.desiagn.pattern.behavioralPattern.iterator.test;

import com.learn.desiagn.pattern.behavioralPattern.iterator.Iterator;
import com.learn.desiagn.pattern.behavioralPattern.iterator.List;

/**
 * @author: lisy
 * @version: : ArrayList , v0.1 2020年05月19日 12:35 下午
 * @remark: the ArrayList is
 */
public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int actualSize; //不包含标记删除元素
    private int totalSize; //包含标记删除元素

    private Object[] elements;
    private long[] addTimestamps;
    private long[] delTimestamps;

    public ArrayList(){
        this.elements = new Object[]{DEFAULT_CAPACITY};
        this.addTimestamps = new long[DEFAULT_CAPACITY];
        this.delTimestamps = new long[DEFAULT_CAPACITY];
        this.actualSize = 0;
        this.totalSize = 0;
    }

    /**
     * 添加元素的时候，同时设置他的插入与删除时间
     * @param obj
     */
    public void add(E obj){
        elements[totalSize] = obj;
        addTimestamps[totalSize] = System.currentTimeMillis();
        delTimestamps[totalSize] = Long.MAX_VALUE;
        totalSize++;
        actualSize++;
    }

    /**
     * 删除元素时，对应下标的数据记录删除时间
     * @param obj
     */
    public void remove(E obj){
        for (int i = 0;i<totalSize;i++){
            if (elements[i].equals(obj)){
                delTimestamps[i] = System.currentTimeMillis();
                actualSize--;
            }
        }
    }

    public int actualSize(){
        return this.actualSize;
    }

    public int totalSize(){
        return this.totalSize;
    }

    public E get(int i){
        if (i > totalSize){
            throw new IndexOutOfBoundsException();
        }
        return (E)elements[i];
    }

    public long getAddTimestamp(int i){
        if (i > totalSize){
            throw new IndexOutOfBoundsException();
        }
        return addTimestamps[i];
    }

    public long getDelTimestamp(int i){
        if (i > totalSize){
            throw new IndexOutOfBoundsException();
        }
        return delTimestamps[i];
    }
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
