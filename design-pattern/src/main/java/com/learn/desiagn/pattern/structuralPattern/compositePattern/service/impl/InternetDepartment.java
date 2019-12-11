package com.learn.desiagn.pattern.structuralPattern.compositePattern.service.impl;

import com.learn.desiagn.pattern.structuralPattern.compositePattern.service.ISchool;

/**
 * @author : lisy
 * @version $Id: InternetDepartment, v 0.1 2019年12月11日 2:22 PM lisy Exp $
 */
public class InternetDepartment implements ISchool {

    private String name;

    public InternetDepartment(String name) {
        this.name = name;
    }

    @Override
    public void addPart(ISchool company) {

    }

    @Override
    public void removePart(ISchool company) {

    }

    @Override
    public void displayPart() {

    }

    @Override
    public void actin() {
        System.out.println(name + ":this is 网络管理!");
    }
}
