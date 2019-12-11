package com.learn.desiagn.pattern.structuralPattern.compositePattern.service;

/**
 * @author : lisy
 * @version $Id: ISchool, v 0.1 2019年12月11日 2:15 PM lisy Exp $
 * 抽象构件
 */
public interface ISchool {

    void addPart(ISchool company);

    void removePart(ISchool company);

    void displayPart();

    /**
     * 不同部门有自己各自的功能
     */
    void actin();

}
