# Constructors and initialization

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

Default and overloaded constructors, `this(...)`, `super(...)`, initialization order, field initializers, static initializers, constructor visibility, and Java 25 flexible constructor bodies.

## 2. Core concepts and rules

Constructors establish an object's invariants. If no constructor is declared, the compiler supplies a default no-argument constructor; declaring any constructor removes that implicit constructor. `this(...)` delegates within a class; `super(...)` invokes a superclass constructor. Java 25 finalized flexible constructor bodies, allowing a restricted prologue before explicit constructor invocation.

## 3. Design guidance

Centralize validation and initialization through constructor chaining. Inject required collaborators through constructors. Avoid network/file I/O in constructors; use factories or lifecycle methods for external resources. Avoid publishing `this` before initialization completes.

## 4. Example walkthrough

The example offers a convenience constructor that delegates to a full constructor, ensuring all validation is performed in one place.

## 5. Common mistakes and edge cases

Do not duplicate validation across overloads. Do not confuse constructors with methods. Do not leak `this` during initialization. Initialization order across inheritance can surprise developers.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.constructors.ConstructorsDemo
```

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.8 · https://docs.oracle.com/en/java/javase/25/language/index.html
