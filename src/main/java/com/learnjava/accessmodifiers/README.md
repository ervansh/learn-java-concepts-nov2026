# Access modifiers and encapsulation

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

`public`, `protected`, package-private, and `private`; top-level type access; packages; getters/setters; immutable objects; module boundaries; and API design.

## 2. Core concepts and rules

Access control determines where a type or member can be referenced. `private` is class-scoped; package-private is visible within the package; `protected` is visible in the package and to qualifying subclasses; `public` is broadly accessible subject to module exports. Top-level classes can be public or package-private (or use newer restricted forms).

## 3. Design guidance

Use the least permissive access that supports the intended API. Keep fields private, expose behavior rather than raw state, and validate mutations. Treat public APIs as compatibility commitments. Package boundaries should group types that collaborate closely.

## 4. Example walkthrough

The demo models an account with private balance state, a public deposit operation, and a read-only balance accessor. Validation prevents invalid state transitions.

## 5. Common mistakes and edge cases

A public setter for every field is not encapsulation. `protected` is not simply public-to-subclasses in every context. Package-private access can create accidental coupling across large packages.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.accessmodifiers.AccessModifiersDemo
```

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-6.html · https://docs.oracle.com/javase/specs/jls/se25/html/jls-7.html
