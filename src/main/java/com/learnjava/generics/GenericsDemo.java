package com.learnjava.generics;
import java.util.*;
public final class GenericsDemo {
 private GenericsDemo() { }
 private static <T> void copy(List<? extends T> source,List<? super T> target) { for(T item:source) target.add(item); }
 public static void main(String[] args) {
  ApiResult<String> result=new ApiResult<>("created");
  List<Number> numbers=new ArrayList<>(); copy(List.of(10,20,30),numbers);
  System.out.println(result.body()); System.out.println(numbers);
 }
}
