package com.learnjava.optional;
import java.util.Optional;
public class OptionalDemo {
 static Optional<String> baseUrl(String env){return "QA".equalsIgnoreCase(env)?Optional.of("https://qa.example.com"):Optional.empty();}
 public static void main(String[] args){String url=baseUrl("QA").map(String::toLowerCase).orElse("https://localhost");System.out.println(url);}
}