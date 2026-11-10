# Strings and text processing

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

String immutability, equality, interning, StringBuilder/StringBuffer, formatting, Unicode, charsets, text blocks, regex integration, and Java 11 string methods.

## 2. Core concepts and rules

String is immutable and represents UTF-16 code units. `equals` compares content; `==` compares reference identity. A Unicode code point may use one or two char values. StringBuilder is mutable and unsynchronized; StringBuffer synchronizes its methods. Specify charsets when converting between text and bytes.

## 3. Design guidance

Use StringBuilder for repeated local concatenation. Specify UTF-8 at I/O boundaries. Normalize and validate external text based on the protocol/domain. Avoid logging secrets; structured logging and explicit field redaction are safer than broad regex guesses.

## 4. Example walkthrough

The demo normalizes a one-line log message, masks a token field, and uses StringBuilder for efficient assembly.

## 5. Common mistakes and edge cases

Do not assume length equals user-perceived character count; avoid platform-default charsets; do not use `==` for content; beware regex redaction gaps and untrusted regex complexity.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.strings.StringsDemo
```

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/StringBuilder.html
