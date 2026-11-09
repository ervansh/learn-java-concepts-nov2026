# Serialization
## Theory
Java object serialization converts an object graph into a byte stream for storage or transfer. Serializable marks a class as eligible. transient fields are not part of default serialization. serialVersionUID identifies a serialization version.
## Concepts
- Serializable and object streams.
- serialVersionUID and transient.
- Compatibility and deserialization security.
## Program
Run SerializationDemo; the transient token is not restored.
## SDET use
Prefer explicit JSON/XML formats for portable test artifacts. Never serialize credentials or untrusted object graphs.
## Pitfalls
- Deserializing untrusted data.
- Assuming transient state is restored.
- Breaking compatibility across class changes.
## Official reference
[Oracle Object Streams](https://docs.oracle.com/javase/tutorial/essential/io/objectstreams.html)