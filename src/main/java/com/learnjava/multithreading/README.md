# Multithreading

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Thread lifecycle, Runnable/Callable, interruption, synchronized, intrinsic locks, volatile, atomic variables, visibility, races, deadlocks and thread confinement.

## 2. Core concepts

A thread is an execution path. Shared mutable state requires a concurrency strategy. synchronized provides mutual exclusion and happens-before visibility; volatile provides visibility/order but not compound-operation atomicity. Interruption is cooperative cancellation.

## 3. Design guidance

Prefer immutable data and thread confinement. Use executors for application task management. Define ownership and shutdown. Avoid lock-order cycles. Preserve interrupt status if InterruptedException cannot be propagated.

## 4. Example walkthrough

The demo starts a named worker, waits with join and demonstrates lifecycle ordering. Extend it with AtomicInteger and multiple workers to compare safe and unsafe increments.

## 5. Common mistakes and edge cases

sleep does not release intrinsic locks. volatile count++ is not atomic. Swallowing InterruptedException breaks cancellation. Unsynchronized shared mutation creates data races.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/javase/tutorial/essential/concurrency/ · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Thread.html
