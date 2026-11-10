package com.learnjava.methods;

public final class MethodsDemo {
    private MethodsDemo() { }
    private static long totalMillis(long... durations) {
        long total = 0;
        for (long duration : durations) {
            if (duration < 0) throw new IllegalArgumentException("duration cannot be negative");
            total = Math.addExact(total, duration);
        }
        return total;
    }
    private static String describe(String operation) { return "operation=" + operation; }
    private static String describe(String operation, int attempt) { return "operation=" + operation + ", attempt=" + attempt; }
    public static void main(String[] args) {
        System.out.println(describe("payment"));
        System.out.println(describe("payment", 2));
        System.out.println("elapsed=" + totalMillis(120, 95, 140) + "ms");
    }
}
