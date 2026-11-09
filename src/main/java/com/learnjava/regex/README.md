# Regular expressions

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Pattern compiles an expression; Matcher applies it. matches requires the whole region to match; find searches for a matching subsequence. Capturing/named groups extract fields. Character classes, quantifiers, anchors, flags and replacements form the core syntax.

## 2. Core concepts

Compile reusable patterns once. Anchor validation patterns. Prefer parsers for nested grammars. Bound input size and avoid catastrophic backtracking on untrusted input. Escape Java string syntax and regex syntax separately.

## 3. Design guidance

The demo illustrates a pattern and match. Extend it with named groups, replaceAll, split, flags and valid/invalid test cases.

## 4. Example walkthrough

Greedy quantifiers may overconsume; matches and find differ; escaping is double-layered; pathological backtracking can cause denial of service.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/regex/Pattern.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/regex/Matcher.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
