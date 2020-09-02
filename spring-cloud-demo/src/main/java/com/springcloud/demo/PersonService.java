package com.springcloud.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Service;

/**
 * @author: lisy
 * @version: : PersonService , v0.1 2020年09月01日 5:20 下午
 * @remark: the PersonService is
 */
@Service
public class PersonService implements IPersonService {

    @Override
    public Person getPerson(int id) {
        return new Person(1 , "this is test!~");
    }
}
