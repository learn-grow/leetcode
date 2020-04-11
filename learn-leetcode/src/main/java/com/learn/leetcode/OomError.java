package com.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : OomError , v0.1 2020年04月11日 3:33 下午
 * @remark: the OomError is
 */
public class OomError {

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        int i = 0;
        boolean runnig = true;
        try{
            while (runnig){
                i++;
                list.add(new byte[1024*1024]); //每次申请1M的空间
            }
        }catch (Throwable e){
            e.printStackTrace();
            runnig = false;
            System.out.println("count :" + i); //打印运行次数
        }
    }
}
