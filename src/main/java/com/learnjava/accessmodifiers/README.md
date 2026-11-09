# Packages and access modifiers
## Theory
Packages organize related types and provide a namespace. public is accessible broadly; protected is accessible in the package and subclasses under Java's access rules; package-private has no modifier; private is limited to the declaring class.
## Concepts
- Package declarations and imports.
- public, protected, package-private and private.
- Encapsulation and static imports.
## Program
Run AccessModifiersDemo. The token field remains private and is exposed only through a boolean query.
## SDET use
Keep framework internals private and expose focused public APIs for test code.
## Pitfalls
- Making all fields public.
- Assuming protected means subclass-only.
- Package naming that does not reflect responsibility.
## Official reference
[Oracle Controlling Access to Members](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)