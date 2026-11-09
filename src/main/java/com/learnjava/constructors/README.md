# Constructors and initialization
## Theory
A constructor initializes a new object and has the same name as its class. Constructors can be overloaded. `this(...)` delegates to another constructor in the same class; `super(...)` invokes a superclass constructor. A constructor invocation must be the first statement.
## Concepts
- Default and parameterized constructors.
- Constructor overloading and chaining with this().
- Superclass initialization and initialization order.
## Program
Run `ConstructorsDemo` and trace which constructor delegates to which.
## SDET use
Use constructors to require essential dependencies and create valid immutable configuration objects.
## Pitfalls
- Recursive constructor delegation.
- Forgetting that this()/super() must be first.
- Performing slow external work during object construction.
## Official reference
[Oracle Providing Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)