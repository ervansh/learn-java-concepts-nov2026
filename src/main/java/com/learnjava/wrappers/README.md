# Wrapper classes and autoboxing
## Theory
Wrapper classes represent primitive values as objects: Integer for int, Boolean for boolean, and so on. Autoboxing and unboxing convert between primitive and wrapper forms. Wrappers can be null; unboxing null throws NullPointerException.
## Concepts
- Wrapper types and valueOf/parse methods.
- Autoboxing, unboxing and comparison.
- Integer caching and nullable wrapper values.
## Program
Run WrapperClassesDemo. Uncomment an unboxing of missing to observe the null failure.
## SDET use
Use wrappers when a value may be absent; use primitives for required numeric/boolean values.
## Pitfalls
- Unboxing null.
- Comparing wrappers with == instead of value comparison.
- Assuming wrapper identity for numeric equality.
## Official reference
[Oracle Integer API](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)