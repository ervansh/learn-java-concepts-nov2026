# Reflection

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Class, ClassLoader, constructors/methods/fields, generic metadata, dynamic invocation, proxies, accessibility, modules and reflection trade-offs.

## 2. Core concepts

Reflection inspects runtime type metadata. getDeclaredMethods includes non-public members declared by a class; getMethods includes public inherited members. Strong encapsulation and module boundaries constrain deep reflection.

## 3. Design guidance

Use reflection at framework/tooling boundaries, not routine business logic. Cache metadata where appropriate. Consider MethodHandles or generated code for specialized infrastructure. Avoid bypassing encapsulation casually.

## 4. Example walkthrough

The demo obtains a public method by name and invokes it on a newly constructed object. Extend it to inspect annotations and generic signatures without forcing private access.

## 5. Common mistakes and edge cases

Reflection is less refactor-safe and may fail due to module access, missing classes or changed signatures. Never assume private access is always available.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/reflect/package-summary.html · https://docs.oracle.com/javase/specs/jls/se25/html/jls-12.html
