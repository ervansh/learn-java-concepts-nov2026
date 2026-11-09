# Enums

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Enum constants, fields, constructors, methods, switch integration, EnumSet, EnumMap and constant-specific class bodies.

## 2. Core concepts

An enum is a special class whose instances are its declared constants. Constructors are effectively private. EnumSet and EnumMap are specialized efficient collections. Constants can carry data and behavior.

## 3. Design guidance

Use enums for closed known sets. Give persisted values explicit stable codes; never persist ordinal as business identity. Keep constant-specific behavior close to the enum only when it improves cohesion.

## 4. Example walkthrough

The demo gives each order state an external code and uses EnumSet to enumerate all states. Extend it with a valid-transition table.

## 5. Common mistakes and edge cases

ordinal is declaration position, not a stable identifier. Do not assume enum constructors are public. Enum constants are singletons per enum class loader.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Enum.html · https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.9
