# Concurrency utilities

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

ExecutorService, Future, Callable, CompletableFuture, locks, semaphores, latches, barriers, blocking queues, concurrent collections and ForkJoinPool. Structured concurrency is release-sensitive; do not assume preview APIs are final or available in Java 25.

## 2. Core concepts

ExecutorService separates task submission from thread management. Future represents a pending result; CompletableFuture composes asynchronous stages. Locks offer capabilities beyond synchronized; blocking queues coordinate producers and consumers.

## 3. Design guidance

Bound pools and queues, define timeout/cancellation policies, handle asynchronous exceptions and shut down executors. Avoid blocking common pools with long-running I/O. Use semaphores to limit scarce-resource concurrency.

## 4. Example walkthrough

The demo submits callable work to a fixed executor, retrieves the result with a timeout and shuts down the executor. Extend it with CompletableFuture composition and a bounded producer/consumer queue.

## 5. Common mistakes and edge cases

Unbounded queues can exhaust memory. Forgotten executor shutdown leaks threads. Future.get blocks. Cancellation may be cooperative. Handle exceptional completion.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/package-summary.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletableFuture.html
