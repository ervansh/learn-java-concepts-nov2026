# Optional

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Optional creation; of/ofNullable/empty; map/flatMap/filter; orElse/orElseGet/orElseThrow; ifPresent; primitive Optional variants; API design.

## 2. Core concepts

Optional models a possibly absent value. map transforms; flatMap avoids nested Optional; filter conditionally retains. orElse evaluates eagerly, while orElseGet evaluates lazily only when empty.

## 3. Design guidance

Use Optional primarily as a return type. Do not call get without checking. Return empty collections instead of Optional<List<T>>. Optional is not a universal replacement for null or a general field/parameter convention.

## 4. Example walkthrough

The demo resolves a named endpoint from a map and validates its scheme before applying a fallback. Extend it with flatMap and orElseThrow.

## 5. Common mistakes and edge cases

orElse(expensiveCall()) evaluates eagerly. Optional is not serializable. Avoid Optional for collection results and nested Optional values.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Optional.html
