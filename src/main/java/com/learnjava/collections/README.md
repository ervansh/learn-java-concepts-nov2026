# Collections Framework

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

List preserves order and allows duplicates; Set enforces uniqueness; Queue/Deque model processing order; Map associates keys and values but is not a Collection. ArrayList offers indexed access and amortized append; HashMap/HashSet use hashing; LinkedHashMap/Set preserve insertion order; TreeMap/Set sort; ArrayDeque is preferred over legacy Stack.

## 2. Core concepts

Choose by required semantics first, then complexity. Hash-based collections rely on equals/hashCode; sorted structures rely on ordering. Map iteration order is unspecified unless implementation says otherwise. Use immutable copies at API boundaries. ConcurrentHashMap does not make arbitrary compound workflows atomic.

## 3. Design guidance

The demo counts repeated event names with a map and derives unique values with a linked set. Extend it to compare lookup, ordering, iteration and removal behavior.

## 4. Example walkthrough

Mutable keys whose equality/hashCode changes can become unreachable. Fail-fast iterators are best-effort bug detection, not thread safety. Do not structurally modify collections during ordinary iteration.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/package-summary.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
