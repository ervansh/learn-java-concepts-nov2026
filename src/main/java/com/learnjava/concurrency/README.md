# Concurrency utilities

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

ExecutorService, Future, Callable, CompletableFuture, locks, semaphores, latches, barriers, blocking queues, concurrent collections and ForkJoinPool. Structured concurrency has release-specific status; do not assume preview APIs are final or available in Java 25.

## 2. Core concepts

Bound pools and queues, define timeout/cancellation policies, handle asynchronous exceptions and shut down executors. Avoid blocking common pools with long-running I/O. Use semaphores to limit scarce-resource concurrency.

## 3. Design guidance

The demo introduces executor-based task submission. Extend it with CompletableFuture composition, timeout handling, bounded producer/consumer queues and CountDownLatch coordination.

## 4. Example walkthrough

Unbounded queues can exhaust memory. Forgotten executor shutdown leaks threads. Future.get blocks. Cancellation may be cooperative. Handle exceptional completion.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/package-summary.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletableFuture.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
