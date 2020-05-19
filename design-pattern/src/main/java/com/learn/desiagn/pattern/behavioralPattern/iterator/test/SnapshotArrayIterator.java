package com.learn.desiagn.pattern.behavioralPattern.iterator.test;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * @author: lisy
 * @version: : SnapshotArrayIterator , v0.1 2020年05月19日 1:11 下午
 * @remark: the SnapshotArrayIterator is
 */
public class SnapshotArrayIterator<E> implements Iterable<E> {

    private long snapshotTimestamp;
    private int cursorInAll; //在整个容器中的下标，而非快照中的下标
    private int leftCount; //快照中还有几个元素未被遍历到
    private ArrayList<E> arrayList;

    public SnapshotArrayIterator(ArrayList<E> arrayList){
        this.snapshotTimestamp = System.currentTimeMillis();
        this.cursorInAll = 0;
        this.leftCount = arrayList.actualSize(); // 这里是真正的容器的有效
        this.arrayList = arrayList;
        justNext();
    }

    public boolean hashNext(){
        return this.leftCount >= 0; //
    }

    public E next(){
        E currentItem = arrayList.get(cursorInAll);
        justNext();
        return currentItem;
    }

    /**
     * 对比游标的下一个元素的添加与删除时间 与当前时间的关系
     */
    private void justNext() {
        while (cursorInAll < arrayList.totalSize()){
            long addTimestamp = arrayList.getAddTimestamp(cursorInAll);
            long delTimestamp = arrayList.getDelTimestamp(cursorInAll);
            if (snapshotTimestamp > addTimestamp && snapshotTimestamp < delTimestamp){
                leftCount--;
                break;
            }
            cursorInAll++;
        }
    }


    @NotNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
