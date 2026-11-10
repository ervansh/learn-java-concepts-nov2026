package com.learnjava.dateandtime;
import java.time.*;import java.time.format.DateTimeFormatter;
public class DateTimeDemo {
 public static void main(String[] args){ZonedDateTime now=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));Instant start=Instant.now();Duration elapsed=Duration.between(start,start.plusSeconds(95));System.out.println(now.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));System.out.println(elapsed.getSeconds());}
}