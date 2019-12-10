package com.learn.desiagn.pattern.structuralPattern.facadePattern;

/**
 * @author : lisy
 * @version $Id: FacadePatternTest, v 0.1 2019年12月10日 2:52 PM lisy Exp $
 * 外观模式 facade
 */
public class FacadePatternTest {

    public static void main(String args[]) throws InterruptedException {

        ComputerFacade facade = new ComputerFacade();

        facade.start();

        System.out.println();
        Thread.sleep(1000l); //休眠1秒
        System.out.println();

        facade.shutdown();

    }
}
