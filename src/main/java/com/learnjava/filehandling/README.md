# File handling and NIO.2

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Path represents a filesystem path; Files performs operations. NIO.2 supports buffered and stream I/O, attributes, directory traversal, temporary files and atomic moves where supported. Choose charsets explicitly.

## 2. Core concepts

Use try-with-resources for streams. Avoid loading huge files fully into memory. Validate untrusted paths against an allowed root. Prefer atomic replacement when supported. Normalization alone is not a security boundary.

## 3. Design guidance

The demo reads/writes a file. Extend it with UTF-8, a temporary directory, Files.lines with try-with-resources, and cleanup in finally.

## 4. Example walkthrough

Untrusted path traversal, platform-specific separators, permission failures, races and accidental truncation are common risks.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/file/package-summary.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/file/Files.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
