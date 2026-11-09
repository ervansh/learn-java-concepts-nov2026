# JVM, memory and garbage collection
## Theory
The JVM loads and executes Java bytecode. Runtime memory areas include per-thread stacks and shared heap/method-area-related structures. Objects are typically allocated on the heap; local variables and method frames are associated with thread stacks. Garbage collection reclaims heap objects that are no longer reachable.
## Concepts
- JVM, class loading and bytecode execution.
- Stack frames, heap objects and references.
- Garbage collection, reachability and memory leaks.
## Program
Run JvmDemo. Setting a reference to null does not force immediate garbage collection.
## SDET use
Diagnose memory growth in long-running suites by inspecting retained objects, static caches, listeners and thread-local state.
## Pitfalls
- Assuming System.gc() guarantees collection.
- Confusing an object becoming unreachable with immediate reclamation.
- Keeping references alive in static collections or unclosed resources.
## Official reference
[Oracle Java SE 8 HotSpot VM Garbage Collection](https://docs.oracle.com/javase/8/docs/technotes/guides/vm/gctuning/)