# Wrapper classes and boxing

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Each primitive has a wrapper. Autoboxing converts primitive values to wrappers; unboxing can throw NullPointerException for null. Wrappers are immutable. Integer caching means identity comparisons may appear to work for some values but are not valid comparisons.

## 2. Core concepts

Use primitives for computation when absence is not meaningful; wrappers when nullability or generics require references. Compare values, not identities. Use BigDecimal with explicit scale/rounding for decimal business arithmetic.

## 3. Design guidance

The demo illustrates parsing and boxing. Extend it to handle nullable configuration explicitly and use BigDecimal(String) for monetary values.

## 4. Example walkthrough

Never compare wrappers with ==. Unboxing null throws. Narrowing conversions can overflow. BigDecimal(double) can preserve binary approximation.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Integer.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/math/BigDecimal.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations. Compile success does not prove behavior against external systems.

## 7. Official references

undefined
