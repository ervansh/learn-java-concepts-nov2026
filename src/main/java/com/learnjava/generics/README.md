# Generics
## Theory
Generics parameterize classes, interfaces and methods with types, enabling compile-time checks and reducing casts. Java implements generics using type erasure. Wildcards express variance; PECS means producer extends, consumer super.
## Concepts
- Generic classes and methods; bounded type parameters.
- Upper/lower bounded wildcards and PECS.
- Raw types, type erasure and type safety.
## Program
Run GenericsDemo. The result container preserves its String type and the sum method accepts Number subtypes.
## SDET use
Use typed API response wrappers, reusable data providers and generic page components instead of raw Object collections.
## Pitfalls
- Raw types and unchecked casts.
- Trying to use primitive types as generic arguments.
- Assuming generic type information is fully available at runtime.
## Official reference
[Oracle Generics Tutorial](https://docs.oracle.com/javase/tutorial/java/generics/)