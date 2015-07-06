package org.madrona.trans_log.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;


public class SessionIdGenerator implements Supplier<String> {

    private AtomicInteger integer = new AtomicInteger(0);

    @Override
    public String get() {
        return String.valueOf(System.currentTimeMillis()) +
                String.format("%04d", integer.incrementAndGet());
    }
}
