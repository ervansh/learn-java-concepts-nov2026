package com.learnjava.constructors;

import java.time.Duration;
import java.util.Objects;

public final class ConstructorsDemo {
    private final String service;
    private final Duration timeout;
    public ConstructorsDemo(String service) { this(service, Duration.ofSeconds(5)); }
    public ConstructorsDemo(String service, Duration timeout) {
        this.service = Objects.requireNonNull(service, "service");
        this.timeout = Objects.requireNonNull(timeout, "timeout");
        if (service.isBlank() || timeout.isZero() || timeout.isNegative())
            throw new IllegalArgumentException("invalid service configuration");
    }
    public String summary() { return service + " timeout=" + timeout; }
    public static void main(String[] args) {
        System.out.println(new ConstructorsDemo("inventory").summary());
        System.out.println(new ConstructorsDemo("billing", Duration.ofSeconds(2)).summary());
    }
}
