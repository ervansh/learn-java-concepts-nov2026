# Networking and HTTP client

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

URI identifies resources; Java HttpClient supports HTTP/1.1 and HTTP/2, synchronous send and asynchronous sendAsync. Requests have timeouts, headers and body handlers. HTTP status codes are application outcomes; successful transport does not imply business success.

## 2. Core concepts

Reuse HttpClient instances. Set connect/request timeouts. Validate destinations, handle non-2xx responses and define retry rules only for idempotent operations. Keep secrets out of logs and never disable TLS validation.

## 3. Design guidance

The demo introduces Java HttpClient. A production client should configure timeouts, inspect status/content type, parse bodies safely, and handle I/O and interruption failures.

## 4. Example walkthrough

Do not blindly retry non-idempotent requests. Network calls can stall or fail. Validate redirect/destination behavior when handling untrusted URIs.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.net.http/java/net/http/HttpClient.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/net/package-summary.html

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

undefined
