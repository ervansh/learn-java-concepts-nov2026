# Wrapper classes and boxing

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Primitive wrapper types, autoboxing/unboxing, parsing, valueOf, caching, numeric conversions, comparison, null unboxing and BigDecimal.

## 2. Core concepts

Each primitive has a wrapper class. Autoboxing converts primitive values to wrappers; unboxing converts wrappers to primitives and throws NullPointerException for null. Wrappers are immutable. Wrapper caching makes identity comparisons unreliable.

## 3. Design guidance

Use primitives for computation when absence is not meaningful; wrappers when nullability or generic APIs require references. Compare values, not identities. Use BigDecimal with explicit scale and rounding for decimal business arithmetic.

## 4. Example walkthrough

The demo illustrates boxing/unboxing and BigDecimal construction from a decimal string. Extend it with nullable input handling and overflow-safe conversions.

## 5. Common mistakes and edge cases

Never compare wrappers with ==. Unboxing null throws. Narrowing conversions can overflow. BigDecimal(double) may preserve binary floating-point approximation.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Integer.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/math/BigDecimal.html
