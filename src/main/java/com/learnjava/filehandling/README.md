# File handling and NIO
## Theory
Java I/O provides byte streams and character streams. NIO.2 uses Path and Files for filesystem operations. Specify a charset when reading/writing text and close resources with try-with-resources when using stream/reader APIs.
## Concepts
- Path, Paths and Files.
- Byte streams versus character streams; buffering.
- Reading/writing files, directories and UTF-8 text.
## Program
Run FileHandlingDemo; it writes a report under target/ and reads it back.
## SDET use
Read test data and write artifacts using explicit paths, encodings and controlled temporary directories.
## Pitfalls
- Platform-default charset assumptions.
- Hard-coded machine-specific paths.
- Failing to close streams.
## Official reference
[Oracle Basic I/O](https://docs.oracle.com/javase/tutorial/essential/io/)