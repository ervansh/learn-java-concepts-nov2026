# Annotations
## Theory
Annotations provide metadata associated with program elements. RetentionPolicy controls whether metadata is available in source, class files or at runtime. Target restricts the elements on which an annotation can appear.
## Concepts
- Built-in annotations such as Override and Deprecated.
- Custom annotations; Retention and Target.
- Runtime inspection and framework metadata.
## Program
Run AnnotationsDemo to discover a method annotated with SmokeTest.
## SDET use
Test frameworks use annotations to mark tests, lifecycle hooks, data providers and configuration.
## Pitfalls
- Choosing retention incorrectly.
- Assuming annotations execute behavior by themselves.
## Official reference
[Oracle Annotations](https://docs.oracle.com/javase/tutorial/java/annotations/)