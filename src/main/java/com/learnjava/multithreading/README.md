# Multithreading
## Theory
A thread is an independent path of execution within a process. Calling start() schedules a new thread; calling run() directly is an ordinary method call. Shared mutable state requires safe coordination.
## Concepts
- Thread, Runnable, lifecycle, start, join and interruption.
- Race conditions and synchronization.
- Visibility, volatile and thread-safe design.
## Program
Run MultithreadingDemo; observe the worker and main thread names.
## SDET use
Parallel tests require isolated drivers, test data and reporting state. Avoid sharing mutable WebDriver instances between test threads.
## Pitfalls
- Calling run() instead of start().
- Assuming thread execution order.
- Ignoring interruption or unsynchronized shared state.
## Official reference
[Oracle Concurrency Tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/)