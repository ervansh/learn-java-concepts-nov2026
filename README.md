# Learn Java Concepts

A pure Java learning repository. Each topic lives in its own package under `src/main/java/com/learnjava`, with a focused guide and runnable example. There are no Selenium, TestNG, Rest Assured, or other test-automation framework dependencies.

## Supported baseline

- **Java 25 LTS** is the default curriculum and compilation baseline.
- Concepts available since Java 8 remain covered where relevant, with their release history called out.
- Features introduced after Java 25 are documented separately and must be labelled by release and preview/final status. Preview features are not part of the default build.
- Verify language rules against the Java Language Specification and API behavior against the Java SE API documentation.

## Prerequisites

- JDK 25
- Maven 3.9+
- Git

Check your toolchain:

```bash
java -version
javac -version
mvn -version
```

## Build

```bash
mvn clean verify
```

## Topic index

| Topic | Package | Guide |
|---|---|---|
| Java fundamentals and types | `basics` | [Guide](src/main/java/com/learnjava/basics/README.md) |
| Control flow | `controlflow` | [Guide](src/main/java/com/learnjava/controlflow/README.md) |
| Arrays | `arrays` | [Guide](src/main/java/com/learnjava/arrays/README.md) |
| Methods and parameters | `methods` | [Guide](src/main/java/com/learnjava/methods/README.md) |
| Strings and text processing | `strings` | [Guide](src/main/java/com/learnjava/strings/README.md) |
| Object-oriented programming | `oop` | [Guide](src/main/java/com/learnjava/oop/README.md) |
| Constructors and initialization | `constructors` | [Guide](src/main/java/com/learnjava/constructors/README.md) |
| Interfaces | `interfaces` | [Guide](src/main/java/com/learnjava/interfaces/README.md) |
| Access modifiers and encapsulation | `accessmodifiers` | [Guide](src/main/java/com/learnjava/accessmodifiers/README.md) |
| Collections Framework | `collections` | [Guide](src/main/java/com/learnjava/collections/README.md) |
| Generics | `generics` | [Guide](src/main/java/com/learnjava/generics/README.md) |
| Exceptions | `exceptions` | [Guide](src/main/java/com/learnjava/exceptions/README.md) |
| Enums | `enums` | [Guide](src/main/java/com/learnjava/enums/README.md) |
| Wrapper classes and boxing | `wrappers` | [Guide](src/main/java/com/learnjava/wrappers/README.md) |
| Lambdas and functional interfaces | `lambdas` | [Guide](src/main/java/com/learnjava/lambdas/README.md) |
| Stream API | `streams` | [Guide](src/main/java/com/learnjava/streams/README.md) |
| Optional | `optional` | [Guide](src/main/java/com/learnjava/optional/README.md) |
| Date and time API | `dateandtime` | [Guide](src/main/java/com/learnjava/dateandtime/README.md) |
| File handling and NIO.2 | `filehandling` | [Guide](src/main/java/com/learnjava/filehandling/README.md) |
| Regular expressions | `regex` | [Guide](src/main/java/com/learnjava/regex/README.md) |
| Multithreading | `multithreading` | [Guide](src/main/java/com/learnjava/multithreading/README.md) |
| Concurrency utilities | `concurrency` | [Guide](src/main/java/com/learnjava/concurrency/README.md) |
| Annotations | `annotations` | [Guide](src/main/java/com/learnjava/annotations/README.md) |
| Reflection | `reflection` | [Guide](src/main/java/com/learnjava/reflection/README.md) |
| Serialization | `serialization` | [Guide](src/main/java/com/learnjava/serialization/README.md) |
| JDBC | `jdbc` | [Guide](src/main/java/com/learnjava/jdbc/README.md) |
| Networking and HTTP client | `networking` | [Guide](src/main/java/com/learnjava/networking/README.md) |
| Design patterns | `designpatterns` | [Guide](src/main/java/com/learnjava/designpatterns/README.md) |
| SOLID principles | `solidprinciples` | [Guide](src/main/java/com/learnjava/solidprinciples/README.md) |
| Nested and inner classes | `innerclasses` | [Guide](src/main/java/com/learnjava/innerclasses/README.md) |
| JVM, memory model and garbage collection | `jvm` | [Guide](src/main/java/com/learnjava/jvm/README.md) |
| Modern Java language features and release history | `languagefeatures` | [Guide](src/main/java/com/learnjava/languagefeatures/README.md) |

## How to study each topic

1. Read its README from top to bottom.
2. Inspect every source file in that topic's package. Public top-level types should have their own source files.
3. Run the demo class named in that topic's README.
4. Change the example, predict the result, and run it again.
5. Review the edge cases, trade-offs, and official references.

## Code organization rules

- One top-level class, interface, enum, record, or annotation per `.java` file.
- Keep each topic's source and guide together in its package.
- Prefer meaningful domain examples over print-only syntax snippets.
- Avoid hard-coded machine-specific paths and external services.
- Keep examples dependency-free unless a topic genuinely requires an external driver or library; document optional dependencies explicitly.
- Do not put preview language features in the default source tree/build.

## Suggested learning order

Fundamentals → control flow → arrays → methods → strings → OOP → constructors → access modifiers → interfaces → enums → wrappers → collections → generics → exceptions → lambdas → streams → Optional → date/time → file handling → regex → inner classes → annotations → reflection → serialization → multithreading → concurrency → networking → JDBC → SOLID → design patterns → JVM.

## Official references

- [Java SE 25 Documentation](https://docs.oracle.com/en/java/javase/25/)
- [Java SE 25 Language Updates](https://docs.oracle.com/en/java/javase/25/language/)
- [Java Language Specification, Java SE 25](https://docs.oracle.com/javase/specs/jls/se25/html/index.html)
- [Java SE 25 API Specification](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)
- [Java SE Specifications and newer releases](https://docs.oracle.com/javase/specs/)
