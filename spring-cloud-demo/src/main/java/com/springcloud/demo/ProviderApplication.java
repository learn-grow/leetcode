package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: lisy
 * @version: : ProviderApplication , v0.1 2020年09月01日 5:17 下午
 * @remark: the ProviderApplication is 启动类
 */
@SpringBootApplication
public class ProviderApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class , args);
        System.out.println("start service !~");
    }

}
