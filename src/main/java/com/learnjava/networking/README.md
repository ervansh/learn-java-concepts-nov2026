# Networking and HTTP
## Theory
Java networking APIs support URI/URL handling, sockets and HTTP connections. A client should define connect and read timeouts, handle response status and close/disconnect resources.
## Concepts
- URI, URL and connection basics.
- HTTP methods, status codes and timeouts.
- Request/response bodies and resource cleanup.
## Program
Run NetworkingDemo with network access; it sends a GET request to example.com.
## SDET use
This is a low-level overview. For modern API automation, use a dedicated HTTP client such as Rest Assured where appropriate.
## Pitfalls
- Requests without timeouts.
- Not consuming/closing response streams when used.
- Treating all non-2xx statuses as transport exceptions.
## Official reference
[Oracle Networking](https://docs.oracle.com/javase/tutorial/networking/)