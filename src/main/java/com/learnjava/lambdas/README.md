# Lambdas and functional interfaces
## Theory
A functional interface has exactly one abstract method and can be implemented with a lambda or method reference. Java 8 includes Predicate, Function, Consumer and Supplier. Lambdas make behavior a value that can be passed to APIs.
## Concepts
- Functional interfaces and @FunctionalInterface.
- Lambda syntax and effectively final captured variables.
- Method references; Predicate, Function, Consumer and Supplier.
## Program
Run LambdasDemo and replace the predicate or method reference.
## SDET use
Pass reusable filtering, transformation and callback behavior into test-data utilities and stream pipelines.
## Pitfalls
- Capturing a local variable that is not effectively final.
- Overusing lambdas when a named method is clearer.
## Official reference
[Oracle Lambda Expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)