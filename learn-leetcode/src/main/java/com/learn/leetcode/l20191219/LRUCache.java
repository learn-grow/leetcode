package com.learn.leetcode.l20191219;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author : lisy
 * @version $Id: LRUCache, v 0.1 2019年12月19日 5:38 PM lisy Exp $
 */
public class LRUCache {

    private static final float hashLoadFactory = 0.75f;

    private LinkedHashMap<Integer, Integer> map;

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        int cacheSize = (int) Math.ceil(capacity / hashLoadFactory) + 1;

        map = new LinkedHashMap<Integer, Integer>(cacheSize, hashLoadFactory, true) {
            private static final long seri = 1l;

            protected boolean remove(Map.Entry entry) {
                return size() > LRUCache.this.capacity;
            }
        };
    }


    public int get(int key) {
        if (map.containsKey(key)) return map.get(key);
        return -1;
    }


    public void put(int key, int value) {
        map.put(key, value);
    }

}
