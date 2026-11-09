# Design patterns for automation frameworks
## Theory
Design patterns are reusable approaches to recurring design problems, not mandatory templates. Select a pattern when it reduces coupling or clarifies object creation, behavior selection or collaboration.
## Concepts
- Creational: Factory, Builder and Singleton.
- Structural: Adapter, Facade and Decorator.
- Behavioral: Strategy, Observer and Template Method.
- Automation examples: Page Object, Driver Factory and test-data Builder.
## Program
Run DesignPatternsDemo. DriverFactory selects a driver implementation based on configuration.
## SDET use
Factory hides driver construction; Strategy selects wait/retry behavior; Builder creates readable test data; Facade can simplify multi-step workflows.
## Pitfalls
- Applying patterns without a real design problem.
- Global mutable Singleton state in parallel test runs.
- Making factories grow into large conditional dispatchers.
## Official reference
[Oracle Java Tutorials: Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/)