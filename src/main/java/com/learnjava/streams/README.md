# Stream API

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Stream pipelines; source, intermediate and terminal operations; laziness; stateful operations; collectors; grouping; reduction; primitive streams; ordering; parallel streams.

## 2. Core concepts

A stream is a one-use pipeline, not a data structure. Intermediate operations are lazy; terminal operations trigger evaluation. map transforms, filter selects, flatMap flattens, reduce combines and collect builds results. Primitive streams reduce boxing for numeric operations.

## 3. Design guidance

Prefer readable pipelines and avoid side effects. Parallel streams are not automatically faster; consider workload, source splitting, ordering, shared state and common-pool usage. Use collect for mutable reduction.

## 4. Example walkthrough

The demo filters, de-duplicates and sorts numeric values, then calculates an average. Extend it with groupingBy, partitioningBy and downstream collectors.

## 5. Common mistakes and edge cases

Streams cannot be reused after terminal operation. Side effects create races in parallel pipelines. Do not use reduce with mutable containers. Encounter order depends on source and operations.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/stream/package-summary.html · https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
