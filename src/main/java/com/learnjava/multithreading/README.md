# Multithreading

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Thread lifecycle, Runnable/Callable, interruption, synchronized, intrinsic locks, volatile, atomic variables, visibility, races, deadlocks and thread confinement. volatile provides visibility/order, not compound-operation atomicity. Interruption is cooperative cancellation.

## 2. Core concepts

Prefer immutable data and thread confinement. Use executors for application task management. Define ownership and shutdown. Avoid lock-order cycles. Preserve interrupt status if InterruptedException cannot be propagated.

## 3. Design guidance

The demo starts a worker. Extend it with AtomicInteger and multiple workers; compare an unsafe shared counter with synchronized/atomic solutions.

## 4. Example walkthrough

sleep does not release intrinsic locks. volatile count++ is not atomic. Swallowing InterruptedException breaks cancellation. Unsynchronized shared mutation creates data races.

## 5. Common mistakes and edge cases

https://docs.oracle.com/javase/tutorial/essential/concurrency/ · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Thread.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
