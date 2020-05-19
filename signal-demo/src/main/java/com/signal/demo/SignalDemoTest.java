package com.signal.demo;

import sun.misc.Signal;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author: lisy
 * @version: : SignalDemoTest , v0.1 2020年05月14日 11:31 上午
 * @remark: the SignalDemoTest is
 */
public class SignalDemoTest {

    /**
     *  Set up a Un*x signal handler to call {@link #restartApplication(Runnable, boolean)} when the signal is received.
     * @param singalName signalName Name of the signal.
     * @param onExit A runnable to perform on exit.
     * @param withNewest
     * @param pidFile the name of a file to write the process id too
     */
    public static void onSignal(final String singalName , Runnable onExit , Boolean withNewest , String pidFile){
        Signal sig = new Signal(singalName);
        Signal.handle(sig , signal -> {
            restartApplication(onExit , withNewest);
        });

        if (pidFile != null){
            final Path pidFilePath = Paths.get(pidFile);
            try{
                Files.deleteIfExists(pidFilePath);
                Files.createFile(pidFilePath);
                Files.write(pidFilePath , String.format("%d\n",getProcessPid()).getBytes());
            }catch (IOException e){
                throw new UncheckedIOException("can not create pid file :" + pidFile , e);
            }
        }
    }

    /**
     * 获取当前进程id
     * @return
     */
    private static int getProcessPid() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        return Integer.valueOf(runtimeMXBean.getName().split("@")[0]);
    }

    /**
     * 尝试重启应用程序
     * @param onExit
     * @param withNewest
     */
    private static void restartApplication(Runnable onExit, Boolean withNewest) {
        System.out.println("开启清理进程资源.并尝试重新加载新资源");
        try {
            Thread.sleep(10000);
            System.out.println("load 完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("重启完成");
    }


    public static void main(String[] args) {
        onSignal("HUP",new exitRunnable(), false ,"./pid.file");
    }


    static class exitRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("开启");
        }
    }


}
