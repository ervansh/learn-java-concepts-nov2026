# SOLID principles

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Single Responsibility groups code around one reason to change. Open/Closed supports extension without changing stable core behavior. Liskov Substitution preserves behavioral substitutability. Interface Segregation keeps client contracts focused. Dependency Inversion makes policy depend on abstractions.

## 2. Core concepts

SOLID is a set of design heuristics, not compiler rules. Avoid one-class-per-method fragmentation. Identify volatile decisions, keep contracts focused and test behavior at abstraction boundaries.

## 3. Design guidance

The demo illustrates dependency inversion by injecting a channel abstraction. Extend it with focused interfaces and separate implementations, then test behavior at the boundary.

## 4. Example walkthrough

OCP does not mean code is never modified. LSP concerns behavioral contracts, not only matching signatures. Overapplying SOLID creates needless indirection.

## 5. Common mistakes and edge cases

https://martinfowler.com/bliki/DependencyInversionPrinciple.html · https://docs.oracle.com/javase/tutorial/java/concepts/

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

undefined
