package com.learnjava.controlflow;

public final class ControlFlowDemo {
    private ControlFlowDemo() { }
    private static String classify(int status) {
        return switch (status / 100) {
            case 2 -> "SUCCESS";
            case 3 -> "REDIRECTION";
            case 4 -> "CLIENT_ERROR";
            case 5 -> "SERVER_ERROR";
            default -> "INVALID_OR_UNSUPPORTED";
        };
    }
    public static void main(String[] args) {
        System.out.println(classify(503));
        int maxAttempts = 3;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            boolean succeeded = attempt == 3;
            System.out.printf("attempt=%d result=%s%n", attempt, succeeded ? "success" : "retryable failure");
            if (succeeded) break;
        }
    }
}
