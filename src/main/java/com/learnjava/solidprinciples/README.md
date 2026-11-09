# SOLID principles

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Single Responsibility groups code around one reason to change. Open/Closed supports extension without changing stable core behavior. Liskov Substitution preserves behavioral substitutability. Interface Segregation keeps client contracts focused. Dependency Inversion makes policy depend on abstractions.

## 2. Core concepts

SOLID is a set of design heuristics, not compiler rules. SRP is about cohesion and reasons to change. OCP is about extension points. LSP includes preconditions, postconditions and invariants. ISP avoids forcing clients to depend on unused operations. DIP reverses source-level dependency direction.

## 3. Design guidance

Apply pragmatically. Avoid one-class-per-method fragmentation. Identify volatile decisions, keep contracts focused, and test behavior at abstraction boundaries. Keep abstractions owned by the policy layer where appropriate.

## 4. Example walkthrough

The example injects a ReportPublisher abstraction into ReportService. The service owns the high-level policy; ConsolePublisher is a replaceable low-level detail. A production system could add file or remote publishers without changing the service contract.

## 5. Common mistakes and edge cases

OCP does not mean code is never modified. LSP concerns behavioral contracts, not only signatures. Overapplying SOLID creates unnecessary interfaces and indirection.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

https://martinfowler.com/bliki/DependencyInversionPrinciple.html · https://docs.oracle.com/javase/tutorial/java/concepts/
