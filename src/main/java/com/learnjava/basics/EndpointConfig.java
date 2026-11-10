package com.learnjava.basics;

/** Immutable, validated endpoint configuration. */
public record EndpointConfig(String host, int port, boolean tls) {
    public EndpointConfig {
        if (host == null || host.isBlank()) throw new IllegalArgumentException("host is required");
        if (port < 1 || port > 65535) throw new IllegalArgumentException("port out of range");
    }
}
