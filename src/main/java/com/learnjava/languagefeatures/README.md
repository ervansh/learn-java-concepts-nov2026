# Modern Java language features and release history

> **Build baseline:** Java 25 LTS. All source examples in this package use finalized features available in Java 25. Preview features are documented but are not enabled by the default Maven build.

## Why this topic exists

Java evolves through regular releases. A developer should know not only how a feature works, but the release in which it became available and whether it is a preview or permanent feature. This prevents accidental use of APIs or syntax that a target runtime does not support.

## Important language and platform milestones

| Release | Important additions | Status/notes |
|---|---|---|
| Java 8 | Lambdas, method references, functional interfaces, Stream API, Optional, default/static interface methods, java.time | Permanent |
| Java 9 | Module system (JPMS), private interface methods, collection factory methods | Permanent |
| Java 10 | Local-variable type inference with `var` | Permanent; local variables only |
| Java 11 | Standard HTTP Client, String `isBlank`, `strip`, `lines`, `repeat` | Permanent |
| Java 14 | Switch expressions | Permanent |
| Java 15 | Text blocks | Permanent |
| Java 16 | Records, pattern matching for `instanceof` | Permanent |
| Java 17 | Sealed classes and interfaces | Permanent; Java 17 is LTS |
| Java 21 | Record patterns, pattern matching for switch, virtual threads | Permanent; Java 21 is LTS |
| Java 25 | Module import declarations, compact source files and instance main methods, flexible constructor bodies | Permanent in Java 25; Java 25 is LTS |

Always verify a feature's status against the language update documentation for the exact target release. Preview features require explicit compiler/runtime preview flags and can change or be withdrawn. They are intentionally excluded from this project's default source set.

## Core concepts demonstrated

- **Records:** concise data-carrier classes with generated accessors, equality, hashing and string representation. Record components are final references, but referenced objects are not automatically deeply immutable.
- **Sealed types:** constrain which classes/interfaces may extend or implement a type. This can make a hierarchy closed and enable exhaustive pattern matching.
- **Pattern matching:** combines type testing and binding. Pattern matching for switch allows type-based dispatch; with a sealed hierarchy the compiler can check exhaustiveness.
- **Switch expressions:** produce a value and use arrow labels, avoiding accidental fall-through.
- **Local inference:** `var` infers a static type from the initializer; it does not make Java dynamically typed.
- **Text blocks:** multiline string literals improve readability for embedded text, SQL or JSON-like content.

## Example walkthrough

The example defines a sealed `Shape` interface and two permitted record implementations. The switch expression in `ModernFeaturesDemo` uses type patterns and is exhaustive because the permitted hierarchy is closed. The demo also uses `var`, an `instanceof` pattern, and a text block. Each top-level type is in its own source file.

## Design guidance and pitfalls

- Use records for value-like data, not when identity, mutable lifecycle or extensible inheritance is central.
- Use sealed hierarchies when the set of variants is intentionally controlled; do not seal types merely to satisfy a language feature.
- Pattern matching improves readability but does not replace domain modelling or validation.
- `var` is best when the initializer makes the inferred type obvious. Avoid it when it hides an important abstraction.
- Do not copy preview syntax into production code without pinning and testing the exact JDK release and preview flags.

## Run

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.languagefeatures.ModernFeaturesDemo
```

## Official references

- [Oracle Java SE 25 Language Updates](https://docs.oracle.com/en/java/javase/25/language/index.html)
- [Java Language Changes Summary for Java 25](https://docs.oracle.com/en/java/javase/25/language/java-language-changes-summary.html)
- [Java Language Specification, Java SE 25](https://docs.oracle.com/javase/specs/jls/se25/html/index.html)
- [JDK 25 Documentation](https://docs.oracle.com/en/java/javase/25/)
