# Generics

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Generics provide compile-time type safety. Java generic types are invariant: List<Integer> is not List<Number>. `? extends T` is a producer; `? super T` is a consumer (PECS). Type erasure removes most type parameters at runtime; bounds constrain operations.

## 2. Core concepts

Avoid raw types and unchecked casts. Use generic methods where input/output type relationships matter. Understand erasure when overloading. Keep bounds minimal and avoid over-generalization.

## 3. Design guidance

The demo illustrates typed containers. Extend it with a generic copy method using `List<? extends T>` as source and `List<? super T>` as destination.

## 4. Example walkthrough

Type parameters cannot be primitives. `new T()` and generic array creation are generally illegal. Overloads cannot differ only by erased generic signatures.

## 5. Common mistakes and edge cases

https://docs.oracle.com/javase/tutorial/java/generics/ · https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
