# Methods and parameters

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

Method signatures, overload resolution, overriding, varargs, pass-by-value, recursion, static methods, covariant returns, and method references.

## 2. Core concepts and rules

Java passes every argument by value. For object arguments, the copied value is a reference, so a method can mutate the referenced object but cannot reassign the caller's variable. Overloading is resolved at compile time; overriding enables runtime dispatch. Return type alone cannot distinguish overloads. Varargs are arrays and must be the final parameter.

## 3. Design guidance

Keep methods cohesive, validate public inputs, use meaningful return types, and avoid boolean-flag-heavy APIs. Document side effects and exception behavior. Prefer immutable return values when callers should not mutate internal state.

## 4. Example walkthrough

The demo uses overloads for different input forms and a varargs method to aggregate durations, validating negative values and using exact arithmetic.

## 5. Common mistakes and edge cases

Confusing pass-by-value with pass-by-reference, overloading only by return type, ambiguous null overloads, accidental static method hiding, and recursive calls without a base case.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.methods.MethodsDemo
```

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html#jls-8.4 · https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.12
