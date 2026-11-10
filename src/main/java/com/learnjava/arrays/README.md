# Arrays

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

Fixed-length indexed containers, primitive/reference arrays, multidimensional and jagged arrays, covariance, copying, sorting, searching, and `java.util.Arrays`.

## 2. Core concepts and rules

Array length is fixed at allocation. Indexes range from zero to `length - 1`. Arrays are objects; reference arrays are covariant, so an assignment that compiles can still throw ArrayStoreException at runtime. Multidimensional arrays are arrays whose elements may themselves be arrays.

## 3. Design guidance

Use arrays for fixed-size data, primitive storage, and APIs that require arrays. Prefer collections for resizable data. Defensively copy arrays at ownership boundaries. Consider overflow when aggregating large numeric values.

## 4. Example walkthrough

The demo calculates latency statistics from a defensive copy, sorts a copy, and demonstrates why returning an internal array would break encapsulation.

## 5. Common mistakes and edge cases

Empty arrays, invalid indexes, aliasing, shallow copies of nested arrays, array covariance, and integer overflow deserve explicit attention.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.arrays.ArraysDemo
```

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Arrays.html · https://docs.oracle.com/javase/specs/jls/se25/html/jls-10.html
