# Collections Framework

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Lists preserve encounter order and allow duplicates; sets enforce uniqueness; queues and deques model processing order; maps associate keys with values and are not subtypes of Collection. ArrayList supports indexed access; HashMap/HashSet use hashing; linked variants preserve insertion order; TreeMap/TreeSet maintain sorted order; ArrayDeque is usually preferable to legacy Stack.

## 2. Core concepts

A collection's interface describes semantics; the implementation determines ordering, performance and concurrency properties. Hash collections depend on stable equals/hashCode. Sorted collections depend on Comparable or Comparator. Map iteration order is implementation-dependent. Iterators may be fail-fast as a best-effort bug detector, not a synchronization mechanism.

## 3. Design guidance

Choose the data structure from required behavior first, then compare time/space complexity. Use immutable copies when publishing data. Use concurrent collections for concurrent access, while still designing compound operations atomically.

## 4. Example walkthrough

The demo counts repeated event names with a map and derives unique values with a linked set. Extend it by comparing insertion order, sorted order, indexed access and removal behavior across implementations.

## 5. Common mistakes and edge cases

Mutable keys whose equals/hashCode changes can become unreachable. HashMap order is unspecified. Do not structurally modify a collection during ordinary iteration. Fail-fast does not mean thread-safe.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/package-summary.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html
