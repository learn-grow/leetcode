package com.learn.desiagn.pattern.structuralPattern.compositePattern;

import com.learn.desiagn.pattern.structuralPattern.compositePattern.service.impl.ConcreteSchool;
import com.learn.desiagn.pattern.structuralPattern.compositePattern.service.impl.EduSchool;
import com.learn.desiagn.pattern.structuralPattern.compositePattern.service.impl.InternetDepartment;

/**
 * @author : lisy
 * @version $Id: CompositePatternClient, v 0.1 2019年12月11日 2:15 PM lisy Exp $
 */
public class CompositePatternClient {

    public static void main(String args[]){
        ConcreteSchool concreteSchool = new ConcreteSchool("总部");
        concreteSchool.addPart(new InternetDepartment("网络管理"));
        concreteSchool.addPart(new EduSchool("EDU"));

        ConcreteSchool branchSchool = new ConcreteSchool("分部");
        branchSchool.addPart(new InternetDepartment("分部网络管理"));
        branchSchool.addPart(new EduSchool("分部Edu"));

        concreteSchool.actin();
        branchSchool.actin();


    }
}
