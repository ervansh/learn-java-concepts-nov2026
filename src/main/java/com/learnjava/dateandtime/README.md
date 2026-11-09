# Date and time API

> **Baseline:** Java 25 LTS. Release-specific behavior is identified; preview features are not enabled in the default build.

## 1. Scope

Instant, LocalDate, LocalTime, LocalDateTime, ZonedDateTime, OffsetDateTime, Duration, Period, ZoneId, DateTimeFormatter, parsing, arithmetic and daylight-saving behavior.

## 2. Core concepts

Use Instant for a point on the UTC timeline; local types for wall-clock values without a zone; ZonedDateTime for region-based rules. Duration is time-based; Period is calendar-based. java.time types are immutable and thread-safe.

## 3. Design guidance

Persist instants for event timestamps and retain ZoneId where regional civil-time meaning matters. Use explicit formatters and inject Clock for deterministic tests. Account for daylight-saving gaps and overlaps.

## 4. Example walkthrough

The demo formats a time in Asia/Kolkata and calculates a Duration. Extend it to parse an ISO date, add a calendar Period and test with a fixed Clock.

## 5. Common mistakes and edge cases

Do not assume system timezone. LocalDateTime is not a global instant. Duration and Period are not interchangeable. DST can make local times ambiguous or nonexistent.

## 6. Run and experiment

From the repository root, run `mvn clean verify`, then execute the demo class in this package. Inspect its source alongside this guide, add boundary cases, and compare alternative implementations.

## 7. Official references

https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/package-summary.html · https://docs.oracle.com/javase/tutorial/datetime/
