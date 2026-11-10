package com.learnjava.arrays;

import java.util.Arrays;

public final class ArraysDemo {
    private ArraysDemo() { }
    public static void main(String[] args) {
        long[] samples = { 125, 80, 210, 95 };
        long[] sorted = Arrays.copyOf(samples, samples.length);
        Arrays.sort(sorted);
        long total = 0;
        for (long sample : samples) total = Math.addExact(total, sample);
        System.out.println("sorted=" + Arrays.toString(sorted));
        System.out.println("min=" + sorted[0] + " max=" + sorted[sorted.length - 1]);
        System.out.println("average=" + (double) total / samples.length);
    }
}
