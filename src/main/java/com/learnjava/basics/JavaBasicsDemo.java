package com.learnjava.basics;

/** Immutable, validated endpoint configuration. */
record EndpointConfig(String host, int port, boolean tls) {
    EndpointConfig {
        if (host == null || host.isBlank()) throw new IllegalArgumentException("host is required");
        if (port < 1 || port > 65535) throw new IllegalArgumentException("port out of range");
    }
}

public final class JavaBasicsDemo {
    private JavaBasicsDemo() { }
    public static void main(String[] args) {
        int requestCount = 12;
        double successRate = 0.975;
        EndpointConfig config = new EndpointConfig("api.example.test", 443, true);
        System.out.printf("host=%s port=%d tls=%s requests=%d success=%.1f%%%n",
                config.host(), config.port(), config.tls(), requestCount, successRate * 100);
    }
}
