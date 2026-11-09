# Design patterns

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Creational: Factory Method, Abstract Factory, Builder, Prototype, Singleton. Structural: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy. Behavioral: Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor.

## 2. Core concepts

Patterns name recurring collaboration structures, not mandatory templates. Strategy swaps algorithms; Builder handles complex construction; Decorator composes behavior; Adapter bridges incompatible APIs; Observer handles events; State models state-dependent behavior; Factory encapsulates creation.

## 3. Design guidance

The current demo is a minimal factory-style example. Expand it into independent types and cover intent, structure, realistic Java example, trade-offs and when not to use each pattern.

## 4. Example walkthrough

Overengineering, unnecessary interfaces and pattern-name-driven design add indirection. Singleton can create global state; Observer can leak subscriptions; Factory can become a conditional dumping ground.

## 5. Common mistakes and edge cases

https://refactoring.guru/design-patterns · https://docs.oracle.com/javase/tutorial/java/IandI/

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

undefined
