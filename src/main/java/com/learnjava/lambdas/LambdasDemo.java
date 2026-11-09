package com.learnjava.lambdas;
import java.util.*;import java.util.function.*;
public class LambdasDemo {
 public static void main(String[] args){List<String> tests=Arrays.asList("login","checkout","logout");Predicate<String> startsWithL=s->s.startsWith("l");tests.stream().filter(startsWithL).forEach(System.out::println);Function<String,Integer> length=String::length;System.out.println(length.apply("checkout"));}
}