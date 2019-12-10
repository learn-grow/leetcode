package com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter;

import com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter.service.Adaptee;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter.service.Target;
import com.learn.desiagn.pattern.structuralPattern.adapterPattern.objectAdapter.service.impl.ObjectAdapter;

/**
 * @author : lisy
 * @version $Id: ObjectAdapterTest, v 0.1 2019年12月10日 4:49 PM lisy Exp $
 */
public class ObjectAdapterTest {

    public static void main(String args[]){
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
