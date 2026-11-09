package com.learnjava.languagefeatures;

public record Circle(double radius) implements Shape {
    public Circle {
        if (!Double.isFinite(radius) || radius <= 0) throw new IllegalArgumentException("radius must be positive and finite");
    }
    @Override public double area() { return Math.PI * radius * radius; }
}
