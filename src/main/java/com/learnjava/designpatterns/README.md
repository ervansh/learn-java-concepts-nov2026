# Design patterns

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Creational: Factory Method, Abstract Factory, Builder, Prototype, Singleton. Structural: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy. Behavioral: Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor.

## 2. Core concepts

Patterns name recurring collaboration structures, not mandatory templates. Creational patterns encapsulate object creation; structural patterns compose types; behavioral patterns organize communication and responsibility. The strategy example is a behavior selected at runtime through an interface.

## 3. Design guidance

Start with the simplest design. Use Strategy for interchangeable algorithms; Factory when creation belongs behind a boundary; Builder for complex construction; Decorator for composable behavior; Adapter for incompatible APIs; Observer for event notification; State for state-dependent behavior. Avoid global mutable singletons and unnecessary indirection.

## 4. Example walkthrough

The code demonstrates Strategy using separate interface and implementation files. Pattern catalogue: Factory Method creates through an overridable creator; Abstract Factory creates compatible product families; Builder assembles complex objects; Prototype clones configured objects; Singleton restricts instance creation. Adapter translates an API; Bridge separates abstraction from implementation; Composite treats part/whole uniformly; Decorator wraps behavior; Facade simplifies a subsystem; Flyweight shares intrinsic state; Proxy controls access. Chain of Responsibility passes a request through handlers; Command encapsulates an action; Interpreter evaluates a grammar; Iterator traverses a collection; Mediator centralizes collaboration; Memento captures restorable state; Observer broadcasts events; State changes behavior by state; Strategy swaps algorithms; Template Method fixes an algorithm skeleton; Visitor adds operations over object structures.

## 5. Common mistakes and edge cases

Patterns can add indirection and class count. Singleton can create global state. Observer can leak subscriptions. Factory can become a conditional dumping ground. Prefer a function or composition when that is clearer.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://refactoring.guru/design-patterns · https://docs.oracle.com/javase/tutorial/java/IandI/
