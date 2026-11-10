# File handling and NIO.2

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Path, Files, streams, buffered I/O, charset selection, attributes, directory traversal, temporary files, atomic moves and resource management.

## 2. Core concepts

Path represents a filesystem location; Files performs operations. Convenient read/write methods coexist with streaming APIs for large data. Explicit charsets prevent platform-dependent text interpretation.

## 3. Design guidance

Use try-with-resources for streams. Avoid loading large files fully into memory. Validate untrusted paths against an allowed root. Prefer atomic replacement when supported; normalization alone is not a security boundary.

## 4. Example walkthrough

The demo writes UTF-8 content to a temporary file, reads it back and deletes it in a finally block. Extend it with Files.lines and directory traversal.

## 5. Common mistakes and edge cases

Path traversal, platform-specific separators, permission failures, races and accidental truncation are common risks. Filesystem operations can fail even after an existence check.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/file/package-summary.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/nio/file/Files.html
