package com.learn.desiagn.pattern.structuralPattern.adapterPattern.classAdapter;

import com.learn.desiagn.pattern.structuralPattern.adapterPattern.classAdapter.service.Target;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.classAdapter.service.impl.ClassAdapter;

/**
 * @author : lisy
 * @version $Id: AdapterTest, v 0.1 2019年12月10日 4:42 PM lisy Exp $
 */
public class ClassAdapterTest {

    public static void main(String args[]){
        Target target = new ClassAdapter();
        target.request();
    }
}
