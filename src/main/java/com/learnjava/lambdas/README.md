# Lambdas and functional interfaces

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Functional interfaces, lambda syntax, method references, target typing, captured variables, effectively-final rule, java.util.function types and composition.

## 2. Core concepts

A lambda implements a functional interface with one abstract method. Its target type comes from context. Captured local variables must be final/effectively final. Method references are concise lambda alternatives. Predicate, Function, Consumer and Supplier cover common shapes.

## 3. Design guidance

Use lambdas to pass behavior. Keep them short and extract complex logic into named methods. Avoid capturing mutable shared state, especially in parallel work. Use domain-named interfaces when generic function types obscure meaning.

## 4. Example walkthrough

The demo composes two predicates to select paid invoices with positive amounts, then uses a method reference to extract invoice numbers.

## 5. Common mistakes and edge cases

A lambda needs a target functional interface. Captured locals cannot be reassigned. Side effects in predicates and stream lambdas reduce clarity and can introduce races.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/package-summary.html
