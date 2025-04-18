package com.example.hookJVM;

public class JVMShutdownHook {

    static {
        Thread hook = new Thread(() -> {
            String summary = "============Testing JVM Hook===========";
            System.out.println(summary);
        });
        System.out.println("Register JVM Hook");
        Runtime.getRuntime().addShutdownHook(hook);
    }
}
