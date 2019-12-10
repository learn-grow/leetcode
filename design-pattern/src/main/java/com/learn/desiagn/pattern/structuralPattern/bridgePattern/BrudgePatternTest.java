package com.learn.desiagn.pattern.structuralPattern.bridgePattern;

import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.Abstraction;
import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.Implementor;
import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.impl.ConcreteImplementorA;
import com.learn.desiagn.pattern.structuralPattern.bridgePattern.service.impl.RefinedAbstraction;

/**
 * @author : lisy
 * @version $Id: BrudgePatternTest, v 0.1 2019年12月10日 6:21 PM lisy Exp $
 */
public class BrudgePatternTest {

    public static void main(String args[]){
        Implementor implementor = new ConcreteImplementorA();

        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();

    }
}
