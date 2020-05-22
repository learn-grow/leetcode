package com.demo.test.sianal;

/**
 * @author: lisy
 * @version: : BusyWait , v0.1 2020年05月21日 3:51 下午
 * @remark: the BusyWait is 忙等待的实现 会一直占用CPU资源
 */
public class BusyWait {

    protected static MySignal signal = new MySignal();

    public static void main(String[] args) {
        while (!signal.hasDataToProcess){
            for (int i = 0;i<10;i++){
                System.out.println("现在可以去做就一直去做这件事");
            }
            System.out.println("处理完修改共享变量");
            signal.setHasDataToProcess(true);
            System.out.println("修改完成");
        }
    }

}
