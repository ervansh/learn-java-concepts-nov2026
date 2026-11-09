package com.learnjava.strings;

public final class StringsDemo {
    private StringsDemo() { }
    public static void main(String[] args) {
        String raw = "POST /orders token=secret-value status=401";
        String sanitized = raw.replaceAll("(?i)(token=)[^\\s]+", "$1[MASKED]");
        StringBuilder summary = new StringBuilder(64);
        summary.append("event=").append("order-submit").append("; ").append(sanitized);
        System.out.println(summary);
        System.out.println("blank? " + "   ".isBlank());
        System.out.println("repeat=" + "-".repeat(12));
    }
}
