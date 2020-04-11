//package com.dis.lock.etcd;
//
////import io.etcd.jetcd.ByteSequence;
////import io.etcd.jetcd.Client;
////import io.etcd.jetcd.kv.GetResponse;
////import io.etcd.jetcd.kv.PutResponse;
////import io.etcd.jetcd.options.GetOption;
////import io.etcd.jetcd.options.PutOption;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.UUID;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
//import static io.netty.util.CharsetUtil.UTF_8;
//
///**
// * @author: lisy
// * @version: : EtcdUtil , v0.1 2020年04月10日 7:31 下午
// * @remark: the EtcdUtil is
// */
//@Component
//public class EtcdUtil {
//
//    @Autowired
//    private Client etcdClient;
//
//    /**
//     * 查询指定的key 对相应的value
//     * @param key
//     * @return
//     */
//    public String get(String key){
//
//        try {
//            GetResponse getResponse  = etcdClient.getKVClient().get(ByteSequence.from(key, UTF_8) , GetOption.newBuilder().build()).get();
//            if (getResponse.getKvs().isEmpty()) return null;
//            return getResponse.getKvs().get(0).getValue().toString(UTF_8);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public String set(String key , String val , long time){
//        Long uuid = System.currentTimeMillis();
//
//
//        try {
//            PutResponse putResponse = etcdClient.getKVClient().
//                    put(ByteSequence.from(key,UTF_8),
//                            ByteSequence.from(val.getBytes(UTF_8)),
//                            PutOption.newBuilder().withLeaseId(uuid).build()).get();
//            putResponse.getPrevKv();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
