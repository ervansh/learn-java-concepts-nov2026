# Serialization

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Serializable, serialVersionUID, transient fields, object graphs, serialization filters, compatibility and safer alternatives.

## 2. Core concepts

Java serialization converts object graphs to byte streams and reconstructs them. Serializable is a marker interface. serialVersionUID participates in compatibility checks. transient fields are excluded from default serialization. Deserialization may invoke class-specific hooks.

## 3. Design guidance

Prefer explicit formats such as JSON or Protocol Buffers for interoperability. If native serialization is unavoidable, use strict ObjectInputFilter allow-lists and validate reconstructed state. Never accept untrusted serialized input without deliberate security design.

## 4. Example walkthrough

The demo serializes a small value object to an in-memory byte array and reads it back. The transient diagnostic context is not restored; this is a mechanics example, not a network-input pattern.

## 5. Common mistakes and edge cases

Native deserialization of untrusted data is dangerous. Compatibility requires planning. transient is not general secret management. Avoid serializing live resources or framework objects.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/specs/serialization/ · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/ObjectInputFilter.html
