# Optional
## Theory
Optional is a container that may or may not hold a non-null value. It makes absence explicit in return types. It is not intended as a universal replacement for null or as a field/parameter type in every model.
## Concepts
- of, ofNullable and empty.
- map, flatMap, filter, orElse, orElseGet and orElseThrow.
- Eager evaluation of orElse versus lazy evaluation of orElseGet.
## Program
Run OptionalDemo; change the environment to a value other than QA.
## SDET use
Represent a lookup that may not find optional configuration or metadata without returning ambiguous null.
## Pitfalls
- Calling get() without checking presence.
- Using Optional for every field or method parameter.
- Confusing orElse and orElseGet evaluation.
## Official reference
[Oracle Optional API](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)