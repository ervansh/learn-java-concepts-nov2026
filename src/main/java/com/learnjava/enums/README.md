# Enums

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

An enum is a special class whose instances are its declared constants. Constants can have fields, constructors and methods; constructors are effectively private. EnumSet and EnumMap are specialized collections.

## 2. Core concepts

Use enums for closed known sets. Give persisted values explicit stable codes; never persist ordinal as business identity. Put state-specific behavior on constants only when it improves cohesion.

## 3. Design guidance

The demo shows enum constants. Extend it with stable external codes and explicit state transitions rather than relying on declaration order.

## 4. Example walkthrough

ordinal is declaration position, not a stable identifier. Enum constructors are not public. Constants are singletons per enum class loader.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Enum.html · https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.9

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
