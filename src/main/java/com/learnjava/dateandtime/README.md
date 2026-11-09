# Date and time API

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Instant is a point on the UTC timeline. LocalDate/LocalTime/LocalDateTime have no zone. ZonedDateTime applies region-based rules. Duration is time-based; Period is calendar-based. java.time types are immutable and thread-safe.

## 2. Core concepts

Persist instants for event timestamps and retain ZoneId where regional civil-time meaning matters. Use explicit formatters and inject Clock for deterministic tests. Account for daylight-saving gaps and overlaps.

## 3. Design guidance

The demo introduces modern date/time types. Extend it to calculate deadlines from an injected Clock, convert an Instant into Asia/Kolkata, and parse/format ISO values.

## 4. Example walkthrough

Do not assume system timezone. LocalDateTime is not a global instant. Duration and Period are not interchangeable. DST can make local times ambiguous or nonexistent.

## 5. Common mistakes and edge cases

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/package-summary.html · https://docs.oracle.com/javase/tutorial/datetime/

## 6. Run and experiment

From the repository root run `mvn clean verify`, then execute the demo class in this package. Inspect the source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

undefined
