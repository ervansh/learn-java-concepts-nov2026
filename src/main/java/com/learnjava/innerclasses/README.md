# Nested and inner classes
## Theory
A nested class is declared within another class. A static nested class does not require an enclosing instance. A non-static member inner class is associated with an instance of its enclosing class and can access its members, including private members.
## Concepts
- Static nested and non-static member inner classes.
- Local classes and anonymous classes.
- Enclosing instance access and encapsulation.
## Program
Run InnerClassesDemo to see a member inner class access the enclosing suite name.
## SDET use
Use nested types for small helper implementations tightly coupled to one outer class; avoid exposing implementation-only types as top-level public classes.
## Pitfalls
- Creating inner classes when static nested classes are sufficient.
- Holding unintended references to enclosing instances.
## Official reference
[Oracle Nested Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)