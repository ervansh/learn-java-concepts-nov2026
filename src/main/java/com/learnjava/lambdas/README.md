# Lambdas and functional interfaces

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

A lambda implements a functional interface with one abstract method. Its target type comes from context. Captured local variables must be final/effectively final. Method references are concise lambda alternatives. Predicate, Function, Consumer and Supplier cover common function shapes.

## 2. Core concepts

Use lambdas to pass behavior. Keep them short; extract complex logic into named methods. Avoid capturing mutable shared state. Use domain-named functional interfaces where generic types obscure intent.

## 3. Design guidance

The demo shows a lambda passed to a functional interface. Extend it with Predicate composition, method references and Comparator key extractors.

## 4. Example walkthrough

A lambda needs a target functional interface. Captured locals cannot be reassigned. Side effects in predicates or stream lambdas reduce clarity.

## 5. Common mistakes and edge cases

https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/package-summary.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
