# JVM and garbage collection

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

JVM architecture, class loading/linking/initialization, runtime data areas, heap, stacks, metaspace, JIT compilation, bytecode, garbage collectors, references, reachability, Java Memory Model and diagnostics.

## 2. Core concepts

The JVM executes class files. The heap stores objects; each thread has a JVM stack; class metadata is stored in implementation-specific memory (HotSpot uses metaspace). JIT compiles hot code. GC reclaims unreachable objects, not deterministically. JMM defines cross-thread visibility and ordering.

## 3. Design guidance

Diagnose with thread dumps, heap dumps, GC logs, JFR and profilers. Tune only from measurements. Use try-with-resources for native resources; GC is not deterministic resource management. Understand safe publication and happens-before.

## 4. Example walkthrough

The demo reports runtime properties and allocates a small payload. Extend the study with javap bytecode inspection, GC logging, thread dumps and JFR recordings.

## 5. Common mistakes and edge cases

System.gc is only a request. Reachable objects can still be retained accidentally. StackOverflowError and OutOfMemoryError differ. Source order alone does not guarantee cross-thread visibility.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/specs/jvms/ · https://docs.oracle.com/en/java/javase/25/gctuning/
