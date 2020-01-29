package com.kananindzya.agent.counter;

import java.lang.instrument.Instrumentation;

public class AgentCounter {

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Agent counter");
        instrumentation.addTransformer(new ClassTransformer());
    }
}
