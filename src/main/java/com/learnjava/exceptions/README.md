# Exception handling
## Theory
Throwable is the root of Java's error/exception hierarchy. Checked exceptions must be caught or declared; RuntimeException subclasses are unchecked. Use exceptions for exceptional conditions, preserve causes, and close resources reliably.
## Concepts
- try/catch/finally; throw and throws.
- Checked versus unchecked exceptions; custom exception types.
- try-with-resources and exception propagation.
## Program
Run ExceptionsDemo. Change status to 200 and observe the absence of the exception.
## SDET use
Create domain-specific exceptions for invalid test data or setup failures. Preserve the original cause to make CI failures diagnosable.
## Pitfalls
- Catching Exception broadly and swallowing it.
- Using exceptions for ordinary branching.
- Losing the original exception when wrapping.
## Official reference
[Oracle Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)