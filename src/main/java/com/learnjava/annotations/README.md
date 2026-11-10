# Annotations

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Built-in annotations, custom annotation declarations, retention policies, targets, repeatable annotations, annotation processing and runtime reflection.

## 2. Core concepts

Annotations attach metadata to declarations. SOURCE is discarded by the compiler; CLASS is stored in class files; RUNTIME is available through reflection. @Target restricts where an annotation applies. Annotation processors inspect source-level elements at compile time.

## 3. Design guidance

Use annotations for declarative metadata, frameworks and compile-time checks. Prefer compile-time processing where possible. Document inheritance, retention and processing behavior. Keep custom annotations semantically precise.

## 4. Example walkthrough

The demo defines a runtime method annotation in its own source file and reads its value through reflection. Extend it with @Repeatable and a processor.

## 5. Common mistakes and edge cases

Annotations do not execute behavior automatically. Retention determines metadata availability. @Inherited applies only to class annotations and has specific rules.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-9.html#jls-9.6 · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/annotation/package-summary.html
