package com.learn.desiagn.pattern2.structured.adapterDesignPattern.b3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @author: lisy
 * @version: : A , v0.1 2020年04月20日 3:05 下午
 * @remark: the A is
 */
public class A implements IA {

    LinkedHashMap linkedHashMap = new LinkedHashMap();

    @Override
    public void fa() {

        System.out.println("a");
    }
}
