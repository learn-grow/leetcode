package com.learn.desiagn.pattern.behavioralPattern.iterator;

import java.io.IOException;

/**
 * @author: lisy
 * @version: : TryWithResource , v0.1 2020年05月18日 7:29 下午
 * @remark: the TryWithResource is
 */
public class TryWithResource {

    public static void main(String[] args) {
        try(Resource resource = new Resource()){
            resource.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
