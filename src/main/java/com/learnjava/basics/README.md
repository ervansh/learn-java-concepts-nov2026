# Java fundamentals

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

Primitive types and reference types; variables, literals, operators, type conversion, scope, definite assignment, `var` (Java 10), text blocks (Java 15), records (Java 16).

## 2. Core concepts and rules

Java is statically and strongly typed. Primitive variables hold primitive values; reference variables hold references to objects. Widening conversions are generally safe, while narrowing conversions can lose information. Local variables must be definitely assigned. `var` infers a local variable's compile-time type and is not dynamic typing. Records are nominal data-carrier classes with generated accessors, equality, hashing, and string representation; their immutability is shallow.

## 3. Design guidance

Model values with domain-specific types, validate invariants at construction, prefer immutable values, and make conversion/rounding rules explicit. Use BigDecimal for decimal monetary arithmetic; never assume binary floating point exactly represents decimal fractions.

## 4. Example walkthrough

The demo uses a record for a validated endpoint configuration and demonstrates primitive/reference distinctions and formatted output.

## 5. Common mistakes and edge cases

Do not compare object content with `==`; avoid implicit narrowing; do not assume `final` makes referenced objects immutable; remember that records do not deep-copy mutable components.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.basics.JavaBasicsDemo
```

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html · https://docs.oracle.com/en/java/javase/25/language/index.html
