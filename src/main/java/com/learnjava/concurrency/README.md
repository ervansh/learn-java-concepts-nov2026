# Concurrency utilities
## Theory
The java.util.concurrent package provides higher-level abstractions than manually creating threads. ExecutorService manages task execution; Callable returns a result; Future represents a pending result and supports timed retrieval.
## Concepts
- ExecutorService, thread pools, Callable and Future.
- Concurrent collections, atomic variables and locks.
- CountDownLatch and graceful shutdown.
## Program
Run ConcurrencyDemo; the task returns a status code and the pool is shut down in finally.
## SDET use
Use bounded thread pools and explicit timeouts for parallel API checks and data preparation. Ensure each test's resources are isolated.
## Pitfalls
- Unbounded task submission.
- Never shutting down executors.
- Blocking forever on Future.get() without a timeout.
## Official reference
[Java Concurrency Utilities](https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/)