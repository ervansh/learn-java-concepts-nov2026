# JDBC

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

JDBC architecture, DriverManager/DataSource, Connection, PreparedStatement, ResultSet, transactions, auto-commit, commit/rollback, batching, generated keys, SQL injection prevention and resource lifecycle.

## 2. Core concepts

DataSource is generally preferred for managed/poolable connections. PreparedStatement binds values separately from SQL syntax. Transactions group operations; auto-commit commits each statement unless disabled. ResultSet is a cursor and must be closed.

## 3. Design guidance

Use try-with-resources, parameterized SQL, short transactions and explicit rollback. Do not hardcode credentials. Driver and schema are database-specific dependencies.

## 4. Example walkthrough

The demo reads connection details from environment variables and uses a parameterized query. A real run requires a JDBC driver, configured database and matching customer table/columns.

## 5. Common mistakes and edge cases

Never concatenate untrusted values into SQL. Do not hold connections across user interaction. Compilation does not prove database connectivity or schema correctness.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.sql/java/sql/package-summary.html · https://docs.oracle.com/javase/tutorial/jdbc/
