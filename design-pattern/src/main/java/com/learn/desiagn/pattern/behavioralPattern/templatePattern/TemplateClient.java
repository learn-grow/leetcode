package com.learn.desiagn.pattern.behavioralPattern.templatePattern;

import com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.AbstractTemplate;
import com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.impl.JavaImpl;
import com.learn.desiagn.pattern.behavioralPattern.templatePattern.service.impl.PythonImpl;

/**
 * @author : lisy
 * @version $Id: TemplateClient, v 0.1 2019年12月11日 3:10 PM lisy Exp $
 */
public class TemplateClient {

    public static void main(String args[]){
        //java 程序执行
        AbstractTemplate template1 = new JavaImpl();
        template1.template();

        //Python 程序执行
        AbstractTemplate template2 = new PythonImpl();
        template2.template();
    }
}
