# Object-oriented programming

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

Encapsulation, abstraction, inheritance, polymorphism, composition, overriding, dynamic dispatch, `final`, abstract classes, sealed hierarchies, and records.

## 2. Core concepts and rules

Encapsulation protects invariants behind methods. Abstraction exposes essential behavior. Inheritance models substitutable subtypes; composition models collaboration. Overridden instance methods dispatch at runtime. Static methods are hidden, not overridden. Sealed classes restrict permitted subtypes; records are final data carriers.

## 3. Design guidance

Prefer composition over inheritance unless the subtype truly satisfies the base contract. Apply Liskov substitution: subtypes must preserve expected behavior. Keep fields private and avoid exposing mutable internals. Favor shallow hierarchies and explicit ownership.

## 4. Example walkthrough

The demo models a payment instrument hierarchy and invokes an overridden operation through the base abstraction. The base class validates shared identity; the subtype adds card-specific behavior.

## 5. Common mistakes and edge cases

Do not inherit only to reuse code. Avoid calling overridable methods from constructors. Do not strengthen subtype preconditions or weaken postconditions. Avoid mutable public fields.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.oop.OopDemo
```

## 7. Official references

https://docs.oracle.com/javase/tutorial/java/concepts/ · https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html
