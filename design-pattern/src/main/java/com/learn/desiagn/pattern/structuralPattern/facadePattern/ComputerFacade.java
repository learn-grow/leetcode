package com.learn.desiagn.pattern.structuralPattern.facadePattern;

import com.learn.desiagn.pattern.structuralPattern.facadePattern.service.CpuService;
import com.learn.desiagn.pattern.structuralPattern.facadePattern.service.DiskService;
import com.learn.desiagn.pattern.structuralPattern.facadePattern.service.MemoryService;

/**
 * @author : lisy
 * @version $Id: ComputerFacade, v 0.1 2019年12月10日 2:58 PM lisy Exp $
 */
public class ComputerFacade {

    private CpuService cpu;

    private DiskService disk;

    private MemoryService momory;

    public ComputerFacade(){
        cpu = new CpuService();
        disk = new DiskService();
        momory = new MemoryService();
    }

    public void start(){
        cpu.startup();
        momory.statrup();
        disk.startup();
        System.out.println("start the computer!");
    }

    public void shutdown(){
        cpu.shutdown();
        momory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
