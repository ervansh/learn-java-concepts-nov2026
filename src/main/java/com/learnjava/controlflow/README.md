# Control flow

> **Curriculum baseline:** Java 25 LTS. This topic uses stable language features unless stated otherwise.

## 1. Scope

Boolean branching, switch statements/expressions, loops, enhanced for, `break`, `continue`, `return`, `yield`, assertions, and exception-driven exits.

## 2. Core concepts and rules

Control flow defines the execution path. Guard clauses handle invalid states early. A switch expression returns a value and must be exhaustive. Loops require a termination condition and a progress invariant. `break` exits a loop/switch; `continue` skips to the next iteration; `return` exits a method.

## 3. Design guidance

Keep conditions simple and side-effect free. Bound retries and polling loops. Treat retryability as a domain decision, not simply 'catch every exception and repeat'. Make boundary conditions explicit and test zero, one, maximum, and invalid values.

## 4. Example walkthrough

The example classifies HTTP response codes with a switch expression and runs a bounded retry simulation with an explicit stop condition.

## 5. Common mistakes and edge cases

Off-by-one errors, accidental fall-through, unbounded loops, hidden side effects in conditions, and `continue` skipping required work are common defects.

## 6. Run the example

```bash
mvn -q -DskipTests compile
java -cp target/classes com.learnjava.controlflow.ControlFlowDemo
```

## 7. Official references

https://docs.oracle.com/javase/specs/jls/se25/html/jls-14.html · https://docs.oracle.com/en/java/javase/25/language/index.html
