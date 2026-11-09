# Java fundamentals
## Theory
Java source is compiled to bytecode, which is executed by a Java Virtual Machine (JVM). The JDK supplies development tools and a runtime. Java is statically typed: every variable has a declared type. Primitive types store primitive values; reference variables refer to objects. Widening conversions are generally implicit; narrowing conversions require an explicit cast and may lose information.
## Concepts
- Variables, literals, primitive and reference types.
- Operators, precedence, boolean expressions and type conversion.
- Console output and the entry point `public static void main(String[] args)`.
## Program
Run `JavaBasicsDemo`. Change values and observe the result of comparisons and casts.
## SDET use
Use meaningful types for retry counts, timeouts, status flags and test names. Avoid magic numbers; centralize configuration and validate values at boundaries.
## Pitfalls
- Comparing String values with `==` rather than `equals`.
- Narrowing numeric values without checking range or precision.
- Using unclear variable names or unexplained constants.
## Official reference
[Oracle Java Language Tutorials](https://docs.oracle.com/javase/tutorial/java/TOC.html)