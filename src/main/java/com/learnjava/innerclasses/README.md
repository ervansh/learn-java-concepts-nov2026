# Nested and inner classes

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Static nested classes have no enclosing instance. Non-static member inner classes are associated with an enclosing instance. Local and anonymous classes can capture final/effectively-final locals. Lambdas differ in how `this` is interpreted.

## 2. Core concepts

Use static nested classes for helpers without outer-instance needs. Use member inner classes when enclosing access is meaningful. Prefer lambdas for simple functional behavior. Avoid retaining large outer objects accidentally.

## 3. Design guidance

The demo covers nested type structure. Extend it with a static nested result, a member cursor using enclosing state, and a local class capturing an effectively-final variable.

## 4. Example walkthrough

Non-static inner objects retain an enclosing reference. Captured locals must be effectively final. Anonymous-class `this` differs from lambda `this`.

## 5. Common mistakes and edge cases

https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.1.3 · https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

undefined
