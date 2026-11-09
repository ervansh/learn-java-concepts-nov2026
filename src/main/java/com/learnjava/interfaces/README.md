# Interfaces and abstract classes
## Theory
An interface defines a contract that implementing classes agree to provide. A class may implement multiple interfaces. Since Java 8, interfaces may contain default and static methods. An abstract class can hold instance state and constructors as well as abstract/concrete methods.
## Concepts
- Interface declaration and implementation.
- Multiple interface implementation.
- Abstract classes; Java 8 default and static interface methods.
## Program
Run `InterfacesDemo`; replace ChromeBrowser with another implementation.
## SDET use
Define driver, API-client, reporter and data-provider contracts so implementations can change without rewriting test workflows.
## Pitfalls
- Exposing implementation details in an interface.
- Using inheritance when composition is more appropriate.
- Forgetting to implement required abstract methods.
## Official reference
[Oracle Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)