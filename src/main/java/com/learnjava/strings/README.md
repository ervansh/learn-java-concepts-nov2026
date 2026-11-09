# Strings and text handling
## Theory
String is immutable: operations that appear to modify it create another String. Use `equals` for value comparison; `==` compares references. StringBuilder is mutable and efficient for repeated concatenation in a single thread; StringBuffer synchronizes its operations.
## Concepts
- String pool, immutability and common String methods.
- `equals` versus `==`; case conversion, trimming and formatting.
- StringBuilder versus StringBuffer.
## Program
Run `StringsDemo` and compare reference equality with value equality.
## SDET use
Build logs and dynamic test names with StringBuilder when appending repeatedly. Do not log secrets such as access tokens.
## Pitfalls
- Using `==` for String content.
- Repeated concatenation in large loops.
- Assuming String methods mutate the original value.
## Official reference
[Oracle String API](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)