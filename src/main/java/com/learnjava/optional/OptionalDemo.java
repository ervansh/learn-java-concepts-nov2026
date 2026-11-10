package com.learnjava.optional;
import java.util.Map;
import java.util.Optional;
public final class OptionalDemo {
 private OptionalDemo() { }
 public static void main(String[] args) {
  Map<String,String> profiles=Map.of("production","https://service.example.com");
  String endpoint=Optional.ofNullable("production").map(profiles::get).filter(value -> value.startsWith("https://")).orElse("https://localhost");
  System.out.println(endpoint);
 }
}
