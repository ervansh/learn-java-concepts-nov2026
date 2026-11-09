# JDBC

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

JDBC provides Connection, PreparedStatement, ResultSet, transactions, batching, generated keys and metadata. DataSource is generally preferred for managed/poolable connections. PreparedStatement binds values separately from SQL syntax. Auto-commit commits statements individually unless disabled.

## 2. Core concepts

Use try-with-resources, parameterized SQL, short transactions and explicit rollback. Do not hardcode credentials. Database driver and schema are environment-specific dependencies.

## 3. Design guidance

The demo is an entry point. A real run requires a selected database, JDBC driver, schema and connection settings. Use environment variables for secrets and connection details.

## 4. Example walkthrough

Never concatenate untrusted values into SQL. Do not hold connections during user interaction. Source compilation does not prove a configured database or driver works.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.sql/java/sql/package-summary.html · https://docs.oracle.com/javase/tutorial/jdbc/

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

undefined
