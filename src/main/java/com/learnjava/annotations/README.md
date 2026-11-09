# Annotations

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Annotations attach metadata to declarations. Retention is SOURCE, CLASS or RUNTIME. Target restricts applicable elements. Repeatable annotations allow multiple instances. Annotation processors inspect program elements at compile time.

## 2. Core concepts

Use annotations for declarative metadata, frameworks and compile-time checks. Prefer compile-time processing where possible. Document inheritance, retention and processing behavior. Keep custom annotations semantically precise.

## 3. Design guidance

The demo illustrates annotation declaration/discovery. Extend it with a separate public annotation type, @Target, @Retention(RUNTIME), and reflection lookup.

## 4. Example walkthrough

Annotations do not execute behavior automatically. Retention determines metadata availability. @Inherited applies only to class annotations and has specific rules.

## 5. Common mistakes and edge cases

https://docs.oracle.com/javase/specs/jls/se25/html/jls-9.html#jls-9.6 · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/annotation/package-summary.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
