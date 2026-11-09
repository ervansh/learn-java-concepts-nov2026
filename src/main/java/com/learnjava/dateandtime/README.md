# Date and time
## Theory
The java.time API introduced in Java 8 provides immutable, thread-safe date/time types. LocalDate/LocalTime/LocalDateTime have no time zone; Instant represents a UTC timeline point; ZonedDateTime combines date-time and zone rules.
## Concepts
- LocalDate, LocalTime, LocalDateTime, Instant and ZonedDateTime.
- ZoneId, Duration and Period.
- Parsing and formatting with DateTimeFormatter.
## Program
Run DateTimeDemo. Compare instants for elapsed time and zoned values for human-readable local time.
## SDET use
Use explicit zones and Duration-based deadlines for stable time assertions across CI agents.
## Pitfalls
- Assuming local machine timezone.
- Using dates/times as strings for calculations.
- Confusing Duration (time-based) and Period (date-based).
## Official reference
[Oracle java.time API](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html)