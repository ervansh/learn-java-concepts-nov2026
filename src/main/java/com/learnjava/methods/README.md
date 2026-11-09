# Methods
## Theory
A method groups behavior behind a name and may accept parameters and return a value. Overloading uses the same method name with different parameter lists. Java passes all arguments by value; for object references, the copied value is the reference.
## Concepts
- Parameters, return types, scope and static/instance methods.
- Overloading, varargs and recursion.
- Pass-by-value semantics.
## Program
Run `MethodsDemo`; try negative factorial input to see validation.
## SDET use
Keep methods focused: a page action should perform one meaningful operation, while assertions and reporting remain explicit.
## Pitfalls
- Confusing pass-by-value with pass-by-reference.
- Overloading only by return type (not allowed).
- Recursion without a terminating base case.
## Official reference
[Oracle Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)