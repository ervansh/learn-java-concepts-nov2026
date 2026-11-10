package com.learnjava.languagefeatures;

import java.util.List;

public final class ModernFeaturesDemo {
    private ModernFeaturesDemo() { }
    private static String describe(Shape shape) {
        return switch (shape) {
            case Circle circle -> "Circle radius=" + circle.radius();
            case Rectangle rectangle -> "Rectangle " + rectangle.width() + "x" + rectangle.height();
        };
    }
    public static void main(String[] args) {
        var shapes = List.<Shape>of(new Circle(2.5), new Rectangle(3, 4));
        shapes.forEach(shape -> System.out.printf("%s area=%.2f%n", describe(shape), shape.area()));
        Object value = "Java 25";
        if (value instanceof String text) System.out.println(text.strip());
        String message = """
                Modern Java features
                Records, sealed types, and pattern matching
                """;
        System.out.println(message);
    }
}
