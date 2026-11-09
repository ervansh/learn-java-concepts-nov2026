# Stream API
## Theory
A stream processes a sequence of elements through a pipeline. Intermediate operations are lazy; a terminal operation triggers evaluation. Streams do not store data and should generally avoid interfering with their source.
## Concepts
- filter, map, flatMap, distinct, sorted and reduce.
- collect and Collectors; primitive streams.
- Lazy evaluation, side effects and parallel streams.
## Program
Run StreamsDemo to extract unique slow response times and calculate an average.
## SDET use
Summarize test results, filter failures and transform API payload data declaratively.
## Pitfalls
- Reusing a stream after a terminal operation.
- Side effects in stream operations.
- Assuming parallel streams are always faster or safe for shared state.
## Official reference
[Oracle Stream API](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)