# Regular expressions

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Pattern and Matcher, literals, character classes, quantifiers, groups, named groups, anchors, flags, replace/split and Unicode considerations.

## 2. Core concepts

Pattern compiles a regular expression; Matcher applies it. matches requires the whole region to match; find searches for a subsequence. Capturing and named groups expose matched text; non-capturing groups group without capture.

## 3. Design guidance

Compile reusable patterns once. Anchor validation patterns. Prefer parsers for nested grammars. Bound input size and avoid catastrophic backtracking on untrusted input. Escape Java string syntax and regex syntax separately.

## 4. Example walkthrough

The demo extracts semantic-version components using named groups. Extend it with validation, replacement, splitting and negative test cases.

## 5. Common mistakes and edge cases

Greedy quantifiers may overconsume; matches and find differ; escaping is double-layered; pathological backtracking can cause denial of service.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/regex/Pattern.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/regex/Matcher.html
