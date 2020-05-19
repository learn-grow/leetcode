package com.signal.demo;

import sun.misc.Signal;
import sun.misc.SignalHandler;

/**
 * @author: lisy
 * @version: : SignalHandlerExample , v0.1 2020年05月14日 1:36 下午
 * @remark: the SignalHandlerExample is
 */
public class SignalHandlerExample implements SignalHandler {

    private SignalHandler oldHandler;

    @Override
    public void handle(Signal signal) {
        System.out.println("signal handler called for signal" + signal);
        signalAction(signal);
        if (oldHandler != SIG_DFL && oldHandler != SIG_IGN){
            oldHandler.handle(signal);
        }
    }


    /**
     * 获取信号去做相对应的事件处理 ，休眠5秒
     * @param signal
     */
    public void signalAction(Signal signal){
        System.out.println("handing " + signal.getName());
        System.out.println("just sleep for 5 seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static SignalHandler install(String signalName){
        Signal diagSignal = new Signal(signalName);
        SignalHandlerExample handler = new SignalHandlerExample();
        handler.oldHandler = Signal.handle(diagSignal , handler);
        return handler;
    }

    public static void main(String[] args) {
        /**
         * 中断信号 kill or  kill -15
         */
        SignalHandlerExample.install("TERM");

        SignalHandlerExample.install("INT");

        System.out.println("signal handing example");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 信号量
     * 常用
     * TERM:终止信号
     * KILL:Kill信号
     * INT:键盘中断
     * HUP :终端挂起或者控制进程终止
     * BUS：总线错误
     * 其他
     * ALRM:警告
     * CHLD：子进程结束信号
     * CONT:进程继续（曾被停止的进程）
     * FPE:浮点异常
     * ILL:非法指令
     * IO:某I/O操作现在可以进行了
     * IOT:IO捕获指令
     * PIPE:管道破裂: 写一个没有读端口的管道
     * PROF:Profiling定时器到
     * PWR:电源故障
     * QUIT:键盘的退出键被按下
     * SEGV:无效的内存引用
     * STKFLT:协处理器堆栈错误
     * STOP:终止进程
     * TRAP:跟踪/断点捕获
     * TSTP:控制终端（tty）上按下停止键
     * TTIN:后台进程企图从控制终端读
     * TTOU:后台进程企图从控制终端写
     * VTALRM: 实际时间报警时钟信号
     * WINCH:窗口大小改变
     * XCPU:超出设定的CPU时间限制
     * XFSZ:超出设定的文件大小限制
     *
     */
}
