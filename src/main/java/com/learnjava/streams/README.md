# Stream API

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

A stream is a one-use pipeline, not a data structure. Intermediate operations are lazy; terminal operations trigger evaluation. map transforms, filter selects, flatMap flattens, reduce combines and collect builds results. Primitive streams avoid some boxing.

## 2. Core concepts

Prefer readable pipelines and avoid side effects. Parallel streams are not automatically faster; consider workload, source splitting, ordering, shared state and common pool use.

## 3. Design guidance

The demo covers a basic pipeline. Extend it with groupingBy, partitioningBy, mapping, summing, flatMap and primitive streams.

## 4. Example walkthrough

Streams cannot be reused after terminal operation. Side effects create races in parallel pipelines. Use collect for mutable reduction; encounter order depends on source and operations.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/stream/package-summary.html · https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
