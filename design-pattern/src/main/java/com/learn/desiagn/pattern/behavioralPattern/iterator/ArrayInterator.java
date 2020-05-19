package com.learn.desiagn.pattern.behavioralPattern.iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * @author: lisy
 * @version: : ArrayInterator , v0.1 2020年05月18日 12:58 下午
 * @remark: the ArrayInterator is
 */
public class ArrayInterator<E> implements Iterator<E> {

    private int cursor;

    private ArrayList<E> arrayList;

    public ArrayInterator(ArrayList<E> arrayList){
        this.arrayList = arrayList;
        this.cursor = 0;
    }

    @Override
    public boolean hashNext() {
        return cursor != arrayList.size(); //cursor 指向最后一个元素的时候，hashNext扔返回true
    }

    @Override
    public void next() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if (cursor >= arrayList.size()){
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
