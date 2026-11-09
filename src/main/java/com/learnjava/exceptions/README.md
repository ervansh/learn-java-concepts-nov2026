# Exception handling

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Throwable is the root. Error generally represents serious JVM/environment problems; Exception represents conditions applications may handle. Checked exceptions must be caught or declared. RuntimeException is unchecked. try-with-resources closes AutoCloseable resources and preserves close failures as suppressed exceptions.

## 2. Core concepts

Catch where recovery or meaningful translation is possible. Preserve causes when wrapping. Use domain exceptions where callers need distinct recovery behavior. Avoid silent failure.

## 3. Design guidance

The demo illustrates guarded operations and propagation. Extend it by parsing external input and translating a low-level parse failure into a domain exception while retaining the cause.

## 4. Example walkthrough

Do not catch Throwable for ordinary recovery. Avoid empty catch blocks and broad catch-and-ignore. A throwing finally block can mask an earlier failure.

## 5. Common mistakes and edge cases

https://docs.oracle.com/javase/specs/jls/se25/html/jls-11.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/AutoCloseable.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
