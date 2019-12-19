package com.learn.desiagn.pattern.behavioralPattern.mementoPattern;

import com.learn.desiagn.pattern.behavioralPattern.mementoPattern.service.Cretaker;
import com.learn.desiagn.pattern.behavioralPattern.mementoPattern.service.Originator;

/**
 * @author : lisy
 * @version $Id: MementoClient, v 0.1 2019年12月13日 3:25 PM lisy Exp $
 */
public class MementoClient {

    public static void main(String args[]){
        Originator originator = new Originator();
        Cretaker cretaker = new Cretaker();
        originator.setState("$0");
        System.out.println("初始状态:" + originator.getState());
        cretaker.setMemento(originator.createMemento()); //保存状态
        originator.setState("$1");
        System.out.println("新的状态:" + originator.getState());

        originator.restoreMemento(cretaker.getMemento()); //恢复状态

        System.out.println("恢复的状态:" + originator.getState());
    }
}
