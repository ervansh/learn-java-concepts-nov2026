# Java Concepts — Java 8 Learning Repository

A topic-based Java learning repository with separate packages, runnable demonstrations and a guide for each topic. The examples emphasize core Java concepts and their application to maintainable SDET automation frameworks.

## Baseline and build

- **Language baseline:** Java 8.
- **Build:** Maven.
- **Prerequisites:** JDK 8 or a later JDK capable of compiling Java 8 source; Maven installed.
- Verify setup with `java -version` and `mvn -version`.

Build/compile the examples:

```bash
mvn clean test
```

Run an example after compilation:

```bash
java -cp target/classes com.learnjava.collections.CollectionsDemo
```

Replace the class name with the fully qualified class in the table. The JDBC example requires the H2 driver to be added to the runtime classpath before it can be executed.

## Topic index

| Topic | Package | Guide |
|---|---|---|
| Java fundamentals | `com.learnjava.basics` | [README](src/main/java/com/learnjava/basics/README.md) |
| Control flow | `com.learnjava.controlflow` | [README](src/main/java/com/learnjava/controlflow/README.md) |
| Arrays | `com.learnjava.arrays` | [README](src/main/java/com/learnjava/arrays/README.md) |
| Methods | `com.learnjava.methods` | [README](src/main/java/com/learnjava/methods/README.md) |
| Strings | `com.learnjava.strings` | [README](src/main/java/com/learnjava/strings/README.md) |
| Object-oriented programming | `com.learnjava.oop` | [README](src/main/java/com/learnjava/oop/README.md) |
| Constructors | `com.learnjava.constructors` | [README](src/main/java/com/learnjava/constructors/README.md) |
| Interfaces and abstract classes | `com.learnjava.interfaces` | [README](src/main/java/com/learnjava/interfaces/README.md) |
| Access modifiers and packages | `com.learnjava.accessmodifiers` | [README](src/main/java/com/learnjava/accessmodifiers/README.md) |
| Collections | `com.learnjava.collections` | [README](src/main/java/com/learnjava/collections/README.md) |
| Generics | `com.learnjava.generics` | [README](src/main/java/com/learnjava/generics/README.md) |
| Exceptions | `com.learnjava.exceptions` | [README](src/main/java/com/learnjava/exceptions/README.md) |
| Enums | `com.learnjava.enums` | [README](src/main/java/com/learnjava/enums/README.md) |
| Lambdas | `com.learnjava.lambdas` | [README](src/main/java/com/learnjava/lambdas/README.md) |
| Streams | `com.learnjava.streams` | [README](src/main/java/com/learnjava/streams/README.md) |
| Optional | `com.learnjava.optional` | [README](src/main/java/com/learnjava/optional/README.md) |
| Date and time | `com.learnjava.dateandtime` | [README](src/main/java/com/learnjava/dateandtime/README.md) |
| File handling and NIO | `com.learnjava.filehandling` | [README](src/main/java/com/learnjava/filehandling/README.md) |
| Regular expressions | `com.learnjava.regex` | [README](src/main/java/com/learnjava/regex/README.md) |
| Multithreading | `com.learnjava.multithreading` | [README](src/main/java/com/learnjava/multithreading/README.md) |
| Concurrency utilities | `com.learnjava.concurrency` | [README](src/main/java/com/learnjava/concurrency/README.md) |
| Annotations | `com.learnjava.annotations` | [README](src/main/java/com/learnjava/annotations/README.md) |
| Reflection | `com.learnjava.reflection` | [README](src/main/java/com/learnjava/reflection/README.md) |
| Serialization | `com.learnjava.serialization` | [README](src/main/java/com/learnjava/serialization/README.md) |
| JDBC | `com.learnjava.jdbc` | [README](src/main/java/com/learnjava/jdbc/README.md) |
| Networking and HTTP | `com.learnjava.networking` | [README](src/main/java/com/learnjava/networking/README.md) |
| Design patterns | `com.learnjava.designpatterns` | [README](src/main/java/com/learnjava/designpatterns/README.md) |
| SOLID principles | `com.learnjava.solidprinciples` | [README](src/main/java/com/learnjava/solidprinciples/README.md) |
| Wrapper classes | `com.learnjava.wrappers` | [README](src/main/java/com/learnjava/wrappers/README.md) |

## Suggested study sequence

1. Fundamentals, control flow, arrays, methods and strings.
2. OOP, constructors, interfaces, access control and enums.
3. Collections, generics, exceptions and wrapper classes.
4. Lambdas, streams, Optional and date/time.
5. File handling, regex, annotations, reflection and serialization.
6. Multithreading, concurrency, JDBC and networking.
7. Design patterns and SOLID, with SDET-oriented examples.

## How to use each topic

1. Read the topic guide.
2. Run the demonstration class.
3. Change inputs and predict the output before running again.
4. Add boundary cases and failure scenarios.
5. Explain trade-offs, not only definitions.

## Official references

- [Oracle Java SE 8 Documentation](https://docs.oracle.com/javase/8/docs/)
- [Oracle Java Language Tutorials](https://docs.oracle.com/javase/tutorial/java/TOC.html)
- [Oracle Essential Java Classes — Exceptions, I/O and Concurrency](https://docs.oracle.com/javase/tutorial/essential/TOC.html)
- [Oracle Java SE 8 Platform Guides](https://docs.oracle.com/javase/8/docs/technotes/guides/)
- [Apache Maven Compiler Plugin](https://maven.apache.org/plugins/maven-compiler-plugin/)
