package com.learn.desiagn.pattern.behavioralPattern.iterator;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author: lisy
 * @version: : Demo , v0.1 2020年05月18日 1:01 下午
 * @remark: the Demo is
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        Iterator<String> iterator = new ArrayInterator<>(arrayList);
        while (iterator.hashNext()){
            System.out.println(iterator.currentItem());
            iterator.next(); // 移动游标
        }

        java.util.Iterator<String> iter = arrayList.iterator();
        System.out.println("java iterator ~");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }



    }
}
