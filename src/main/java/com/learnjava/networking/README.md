# Networking and HTTP client

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

URI/URL, sockets, DNS, TCP basics, HttpClient, HttpRequest, HttpResponse, synchronous/asynchronous calls, timeouts, headers, status codes, body handlers and TLS.

## 2. Core concepts

Java HttpClient supports HTTP/1.1 and HTTP/2, synchronous send and asynchronous sendAsync. Requests should define timeouts and explicit body handling. HTTP status codes are application-level outcomes; transport success is not business success.

## 3. Design guidance

Reuse HttpClient instances. Set connection/request timeouts. Validate destinations, handle non-2xx responses and retry only when operation semantics allow it. Keep secrets out of logs and never disable TLS validation.

## 4. Example walkthrough

The demo sends a GET request to a configurable endpoint with connection and request timeouts. Extend it to inspect headers, parse a body and handle non-2xx responses.

## 5. Common mistakes and edge cases

Do not blindly retry non-idempotent requests. Network calls can fail or stall. Validate redirects and destination behavior when handling untrusted URIs.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide and add boundary cases. JDBC requires a compatible driver, database and schema; networking requires a reachable endpoint. Compilation alone does not validate external systems.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.net.http/java/net/http/HttpClient.html · https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/net/package-summary.html
