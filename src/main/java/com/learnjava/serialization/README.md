# Serialization

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Java serialization writes object graphs to byte streams. Serializable is a marker interface; serialVersionUID participates in compatibility checks; transient excludes fields from default serialization. Deserialization reconstructs object graphs and may invoke class-specific hooks.

## 2. Core concepts

Prefer explicit formats such as JSON or Protocol Buffers for interoperability. If native serialization is unavoidable, apply strict ObjectInputFilter allow-lists and validate reconstructed state. Never accept untrusted serialized input without deliberate security design.

## 3. Design guidance

The demo illustrates serialization mechanics. Treat it as an in-memory learning example only; do not expose ObjectInputStream to untrusted network/file content.

## 4. Example walkthrough

Native deserialization of untrusted data is dangerous. Compatibility requires planning. transient is not general secret management. Avoid serializing live resources.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/specs/serialization/ · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/ObjectInputFilter.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
