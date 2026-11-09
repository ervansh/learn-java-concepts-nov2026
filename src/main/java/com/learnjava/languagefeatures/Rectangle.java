package com.learnjava.languagefeatures;

public record Rectangle(double width, double height) implements Shape {
    public Rectangle {
        if (!Double.isFinite(width) || !Double.isFinite(height) || width <= 0 || height <= 0)
            throw new IllegalArgumentException("dimensions must be positive and finite");
    }
    @Override public double area() { return width * height; }
}
