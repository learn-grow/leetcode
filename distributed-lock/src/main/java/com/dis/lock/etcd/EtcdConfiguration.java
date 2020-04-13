package com.dis.lock.etcd;

//import io.etcd.jetcd.Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: lisy
 * @version: : EtcdConfiguration , v0.1 2020年04月10日 7:29 下午
 * @remark: the EtcdConfiguration is
 */
@Configuration
public class EtcdConfiguration {

    @Value("${etcd.url}")
    private String etcdUrl;

//    @Bean
//    public Client etcdClient(){
//        Client client = Client.builder().endpoints(etcdUrl).build();
//        return client;
//    }
}
