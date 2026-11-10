# Nested and inner classes

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Static nested classes, member inner classes, local classes, anonymous classes, enclosing instances, capture rules and lambda comparison.

## 2. Core concepts

A static nested class has no enclosing instance. A non-static member inner class is associated with an instance of its enclosing class. Local and anonymous classes can capture final/effectively-final local variables. Lambda `this` refers to the enclosing context; anonymous-class `this` refers to the anonymous object.

## 3. Design guidance

Use static nested classes for helpers that do not need outer state. Use inner classes only when enclosing access is meaningful. Prefer lambdas for simple functional behavior. Avoid accidental retention of large outer objects.

## 4. Example walkthrough

The demo models a report section as a member inner class that reads its enclosing report name, and a static nested Defaults class for shared configuration.

## 5. Common mistakes and edge cases

Non-static inner objects retain an enclosing reference. Captured locals must be effectively final. Anonymous class `this` differs from lambda `this`.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.1.3 · https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
