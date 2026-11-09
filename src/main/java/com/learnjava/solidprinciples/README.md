# SOLID principles
## Theory
SOLID is a set of object-oriented design guidelines: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation and Dependency Inversion. They aim to improve cohesion, extensibility and substitutability.
## Concepts
- SRP: one reason for a class to change.
- OCP: extend behavior without repeatedly modifying stable code.
- LSP: implementations must honor their abstraction's contract.
- ISP: prefer focused interfaces.
- DIP: depend on abstractions, inject implementations.
## Program
Run SolidPrinciplesDemo. The report service depends on ReportPublisher, not a specific console implementation.
## SDET use
Inject browser factories, API clients and report publishers so tests can use real or fake implementations.
## Pitfalls
- Treating SOLID as rigid rules independent of context.
- Creating abstractions with only one trivial implementation and no foreseeable variation.
## Further reading
[Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/)