# Generics

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Generic classes, interfaces and methods; type parameters; bounds; wildcards; PECS; invariance; type erasure; raw types; bridge methods; generic array restrictions.

## 2. Core concepts

Generics provide compile-time type safety. Java generic types are invariant: List<Integer> is not List<Number>. `? extends T` is a producer; `? super T` is a consumer. Type erasure removes most type arguments at runtime; bounds constrain operations available on type variables.

## 3. Design guidance

Avoid raw types and unchecked casts. Use generic methods where input/output relationships matter. Apply PECS when callers benefit from variance. Keep bounds minimal and understand erasure when overloading or interoperating with legacy APIs.

## 4. Example walkthrough

The demo uses a generic result wrapper and a copy method accepting a producer list and consumer list. Try copying Integer values into a List<Number> without unsafe casts.

## 5. Common mistakes and edge cases

Type parameters cannot be primitives. `new T()` and generic array creation are generally illegal. Overloads cannot differ only by erased signatures. Avoid raw collections.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/javase/tutorial/java/generics/ · https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html
