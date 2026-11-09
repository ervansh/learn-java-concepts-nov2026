# Optional

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Optional models a possibly absent value. of rejects null; ofNullable accepts null; empty represents absence. map transforms; flatMap avoids nesting; filter conditionally retains. orElse evaluates eagerly; orElseGet is lazy.

## 2. Core concepts

Use Optional primarily as a return type. Do not call get without checking. Return empty collections rather than Optional<List<T>>. Optional is not a universal replacement for null.

## 3. Design guidance

The demo shows a lookup with fallback. Extend it with map, flatMap, filter, orElseThrow and primitive Optional variants.

## 4. Example walkthrough

orElse(expensiveCall()) evaluates eagerly. Optional is not serializable. Avoid Optional for collection results and nested Optional values.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
