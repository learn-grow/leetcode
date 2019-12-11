package com.learn.desiagn.pattern.structuralPattern.compositePattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.compositePattern.service.ISchool;

import java.util.ArrayList;

/**
 * @author : lisy
 * @version $Id: ConcreteSchool, v 0.1 2019年12月11日 2:18 PM lisy Exp $
 * 抽象构件的具体实现
 */
public class ConcreteSchool implements ISchool {

    private ArrayList<ISchool> partList = new ArrayList<>();
    private String name;
    public ConcreteSchool(String name){
        this.name = name;
    }



    @Override
    public void addPart(ISchool company) {
        partList.add(company);
    }

    @Override
    public void removePart(ISchool company) {
        partList.remove(company);
    }

    @Override
    public void displayPart() {
        for (ISchool iSchool : partList) {
            iSchool.displayPart();
        }
    }

    @Override
    public void actin() {
        for (ISchool iSchool : partList) {
            iSchool.actin();
        }
    }
}
