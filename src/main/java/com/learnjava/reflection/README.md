# Reflection
## Theory
Reflection lets code inspect classes, methods, constructors, fields and annotations at runtime. It is used by frameworks, serializers and dependency injection tools, but it weakens compile-time guarantees and can complicate access and maintenance.
## Concepts
- Class objects and runtime metadata.
- Inspecting and invoking methods.
- Access checks, exceptions and performance considerations.
## Program
Run ReflectionDemo to instantiate a class and invoke a public method.
## SDET use
Understand how test frameworks discover annotated test methods. Prefer direct calls for ordinary application logic.
## Pitfalls
- Reflective access that breaks encapsulation.
- Unhandled reflective exceptions.
- Fragile code depending on private implementation names.
## Official reference
[Oracle Reflection API](https://docs.oracle.com/javase/tutorial/reflect/)