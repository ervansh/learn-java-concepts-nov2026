# JDBC
## Theory
JDBC is Java's API for connecting to relational databases. Connection represents a session; PreparedStatement represents parameterized SQL; ResultSet exposes query results. Use try-with-resources to close JDBC resources.
## Concepts
- DriverManager/DataSource, Connection and transactions.
- PreparedStatement, parameter binding and ResultSet.
- Commit, rollback and SQL exception handling.
## Program
JdbcDemo uses an in-memory H2 URL. Add the H2 JDBC driver dependency to pom.xml before running; the source compiles against the JDK JDBC APIs.
## SDET use
Validate database state using parameterized queries and deterministic cleanup. Keep credentials outside source code.
## Pitfalls
- Building SQL with string concatenation.
- Leaking connections.
- Ignoring transaction boundaries.
## Official reference
[Oracle JDBC Basics](https://docs.oracle.com/javase/tutorial/jdbc/basics/)