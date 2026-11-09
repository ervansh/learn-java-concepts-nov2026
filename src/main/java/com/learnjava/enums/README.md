# Enums
## Theory
An enum defines a fixed set of named constants as a distinct type. Enums can have fields, constructors and methods; their constructors are implicitly private. EnumSet and EnumMap provide specialized collections.
## Concepts
- Enum declaration, values() and valueOf().
- Enum fields, constructors, methods and switch.
- EnumSet and EnumMap.
## Program
Run EnumsDemo and change the selected TestStatus.
## SDET use
Use enums for test status, browser type and environment categories when the allowed values are finite.
## Pitfalls
- Using arbitrary strings for a closed set of states.
- Depending on ordinal values for persistent identifiers.
## Official reference
[Oracle Enum Types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)