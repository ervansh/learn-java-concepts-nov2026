# Regular expressions
## Theory
A regular expression describes a text pattern. Pattern compiles an expression and Matcher applies it to input. matches() checks the entire region; find() searches for a matching subsequence.
## Concepts
- Character classes, quantifiers, groups and anchors.
- Pattern and Matcher; matches versus find.
- Escaping regex metacharacters in Java string literals.
## Program
Run RegexDemo; change the input and observe capture groups.
## SDET use
Validate structured test identifiers and extract fields from predictable text formats. Prefer JSON/XML parsers for structured payloads.
## Pitfalls
- Forgetting Java string escaping.
- Using overly permissive patterns.
- Applying regex to parse nested structured formats.
## Official reference
[Oracle Pattern API](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)