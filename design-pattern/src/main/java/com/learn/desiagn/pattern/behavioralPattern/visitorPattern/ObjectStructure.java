package com.learn.desiagn.pattern.behavioralPattern.visitorPattern;

import com.learn.desiagn.pattern.behavioralPattern.visitorPattern.service.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : lisy
 * @version $Id: ObjectStructure, v 0.1 2019年12月13日 3:05 PM lisy Exp $
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();



    public void add(Element element){
        this.list.add(element);
    }

    public void remove(Element element){
        this.list.remove(element);
    }

}
