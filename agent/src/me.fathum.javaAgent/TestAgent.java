package me.fathum.javaAgent;

import java.lang.instrument.Instrumentation;

public class TestAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("------------------------------");
        System.out.println("this is my agent");
        System.out.println("args for agent:" + agentArgs);
        System.out.println("------------------------------");
    }
}
