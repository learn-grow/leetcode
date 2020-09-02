package com.springcloud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lisy
 * @version: : MainController , v0.1 2020年09月01日 5:23 下午
 * @remark: the MainController is
 */
@RestController
public class MainController {

    @Autowired
    IPersonService personService;

    @GetMapping("/get")
    public String get(){
        return personService.getPerson(1).toString();
    }
}
