package com.kananindzya.agent.memory;

import java.lang.instrument.Instrumentation;

public class AgentMemoryCounter {

    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation instrumentation) {
        AgentMemoryCounter.instrumentation = instrumentation;
    }

    public static long getSize(Object object) {
        if (instrumentation == null) {
            throw new IllegalStateException("Agent not initialized");
        }
        return instrumentation.getObjectSize(object);
    }
}
