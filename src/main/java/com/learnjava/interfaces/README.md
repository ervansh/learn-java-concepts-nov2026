# Interfaces

## Purpose

An interface defines a contract that consumers can use without depending on a concrete implementation. It is useful at boundaries where implementations may vary, where multiple types share a capability, or where a stable abstraction reduces coupling.

## Language rules

- An interface cannot be instantiated and has no constructors.
- A class may implement multiple interfaces, but can extend only one class.
- Interface fields are implicitly `public static final` constants.
- Abstract interface methods are implicitly `public abstract`.
- Java 8 added default and static interface methods. Java 9 added private interface methods to share implementation among default methods.
- A functional interface has exactly one abstract method (excluding methods matching public methods of `Object`) and can be implemented with a lambda.
- An interface can extend multiple interfaces. Conflicting inherited default methods must be resolved by the implementing class.

## Interface versus abstract class

| Interface | Abstract class |
|---|---|
| Defines a capability/contract | Defines a common base with shared state or implementation |
| A class can implement many | A class can extend only one |
| No per-instance fields or constructors | Can have instance fields and constructors |
| Default methods provide limited shared behavior | Can provide protected/public methods and enforce constructor invariants |

Choose based on the relationship and state requirements, not on a rule that every class must have an interface.

## Example walkthrough

`ReportWriter` declares the write operation. It also contains a default capability method and a static validation helper. `CsvReportWriter` implements the contract in its own source file. The demo stores the implementation in a `ReportWriter` variable: callers depend on the contract, not on CSV-specific details.

This design permits a second implementation (for example, a JSON writer) without changing code that only calls `ReportWriter.write`. The interface should document behavioral guarantees, exceptions, null handling, thread-safety, and ownership of returned values.

## Design guidance and pitfalls

- Keep interfaces small and cohesive; avoid forcing implementors to support unrelated operations.
- Do not introduce an interface for every class automatically. Add one when it creates a useful boundary or supports meaningful substitutability.
- Default methods should be conservative: adding one can create conflicts with another inherited default method.
- Do not use interface constants as a substitute for a proper configuration object.
- Prefer composition when a class needs implementation reuse rather than a subtype relationship.

## Run

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.interfaces.InterfacesDemo
```

## References

- [Java Language Specification, Chapter 9 — Interfaces](https://docs.oracle.com/javase/specs/jls/se25/html/jls-9.html)
- [Java SE 25 API documentation](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)
- [Oracle tutorial: Defining an Interface](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
