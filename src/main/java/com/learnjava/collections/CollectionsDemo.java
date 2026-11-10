package com.learnjava.collections;
import java.util.*;
public final class CollectionsDemo {
 private CollectionsDemo() { }
 public static void main(String[] args) {
  List<String> events = new ArrayList<>(List.of("BOOK","PAY","BOOK","SHIP","PAY"));
  Set<String> unique = new LinkedHashSet<>(events);
  Map<String,Integer> counts = new LinkedHashMap<>();
  for (String event : events) counts.merge(event, 1, Integer::sum);
  System.out.println(events); System.out.println(unique); counts.forEach((k,v) -> System.out.println(k+"="+v));
 }
}
