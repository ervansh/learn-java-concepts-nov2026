# Exception handling

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Throwable hierarchy; checked and unchecked exceptions; try/catch/finally; try-with-resources; custom exception types; exception chaining; suppressed exceptions; multi-catch; propagation.

## 2. Core concepts

Error usually represents serious JVM/environment conditions. Checked exceptions must be caught or declared; RuntimeException and subclasses are unchecked. try-with-resources closes AutoCloseable resources and retains close failures as suppressed exceptions when another exception is primary.

## 3. Design guidance

Catch only where recovery, translation or meaningful context can be added. Preserve causes. Use domain exceptions when callers need distinct recovery behavior. Prefer try-with-resources for resource lifecycles.

## 4. Example walkthrough

The demo translates NumberFormatException into a checked DataFormatException while preserving the cause. Extend it to demonstrate try-with-resources and suppressed exceptions.

## 5. Common mistakes and edge cases

Do not catch Throwable for routine recovery. Avoid empty catch blocks and catch-and-ignore. A throwing finally block can mask an earlier exception. Do not use exceptions for normal branching.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-11.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/AutoCloseable.html
