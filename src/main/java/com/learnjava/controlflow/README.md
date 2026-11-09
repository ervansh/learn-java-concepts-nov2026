# Control flow
## Theory
Selection statements choose a path based on boolean conditions. Iteration statements repeat work while a condition holds or for each item in a collection. `break` exits a loop or switch; `continue` skips to the next loop iteration.
## Concepts
- `if/else`, `switch`.
- `for`, enhanced `for`, `while`, `do-while`.
- `break`, `continue`, nested control flow.
## Program
Run `ControlFlowDemo`; change the HTTP status and environment values.
## SDET use
Use explicit conditions for response validation and bounded retry loops. Every retry loop should have a clear termination condition and a maximum attempt or deadline.
## Pitfalls
- Accidental fall-through in classic switch statements.
- Infinite loops and off-by-one errors.
- Retrying non-retryable failures.
## Official reference
[Oracle Java Language Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)