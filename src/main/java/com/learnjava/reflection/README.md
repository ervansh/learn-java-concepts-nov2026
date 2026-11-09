# Reflection

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Class represents a loaded type. Reflection inspects constructors, methods, fields, modifiers, generic metadata and annotations, and can invoke members dynamically. getDeclaredMethods returns members declared by a type; getMethods returns public inherited methods too.

## 2. Core concepts

Use reflection at framework/tooling boundaries, not routine business logic. Cache metadata where appropriate. Strong encapsulation and module boundaries limit deep reflection. Consider MethodHandles or generated code for specialized infrastructure.

## 3. Design guidance

The demo inspects class metadata. Extend it to inspect annotations and invoke a public method; avoid forcing access to private fields merely to demonstrate setAccessible.

## 4. Example walkthrough

Reflection is less refactor-safe, may fail due to module access and can obscure control flow. Never assume private access is always available.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/reflect/package-summary.html · https://docs.oracle.com/javase/specs/jls/se25/html/jls-12.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
