package com.eureka.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: lisy
 * @version: : EurekaServerApplication , v0.1 2020年09月01日 5:56 下午
 * @remark: the EurekaServerApplication is
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class , args);
    }
}
