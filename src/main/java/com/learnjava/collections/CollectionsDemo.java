package com.learnjava.collections;
import java.util.*;
public class CollectionsDemo {
 public static void main(String[] args) {
  List<String> order=new ArrayList<String>();order.add("login");order.add("checkout");order.add("login");
  Set<String> unique=new LinkedHashSet<String>(order);
  Map<String,Integer> counts=new LinkedHashMap<String,Integer>();counts.put("PASS",12);counts.put("FAIL",2);
  System.out.println(order);System.out.println(unique);
  for(Map.Entry<String,Integer> e:counts.entrySet())System.out.println(e.getKey()+"="+e.getValue());
 }
}