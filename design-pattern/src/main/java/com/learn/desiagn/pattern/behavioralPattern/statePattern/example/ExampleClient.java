package com.learn.desiagn.pattern.behavioralPattern.statePattern.example;

import com.learn.desiagn.pattern.behavioralPattern.statePattern.example.service.ScoreContext;

/**
 * @author : lisy
 * @version $Id: ExampleClient, v 0.1 2019年12月12日 8:18 PM lisy Exp $
 */
public class ExampleClient {

    public static void main(String args[]){

        ScoreContext context = new ScoreContext();
        System.out.println("学生成绩测验");
        context.add(30);
        context.add(40);
        context.add(25);
        context.add(90);
    }
}
