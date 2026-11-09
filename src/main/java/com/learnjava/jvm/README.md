# JVM and garbage collection

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

The JVM executes class files. Runtime areas include heap, per-thread JVM stacks, program counters and method-area abstractions; HotSpot uses metaspace for class metadata. JIT compiles hot code. GC reclaims unreachable objects, not deterministically. JMM defines visibility and ordering.

## 2. Core concepts

Diagnose with thread/heap dumps, GC logs, JFR and profilers. Tune only from measurements. Use try-with-resources for native resources; GC is not deterministic resource management. Understand safe publication and happens-before.

## 3. Design guidance

The demo prints runtime properties. Extend study with javap bytecode inspection, GC logging, a thread dump, JFR recording and heap analysis. These are diagnostic exercises, not microbenchmarks.

## 4. Example walkthrough

System.gc is only a request. Reachable objects can still be retained. StackOverflowError differs from OutOfMemoryError. Source order alone does not guarantee cross-thread visibility.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/specs/jvms/ · https://docs.oracle.com/en/java/javase/25/gctuning/

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

undefined
