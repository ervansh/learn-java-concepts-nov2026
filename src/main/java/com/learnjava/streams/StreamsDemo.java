package com.learnjava.streams;
import java.util.*;import java.util.stream.*;
public class StreamsDemo {
 public static void main(String[] args){List<Integer> times=Arrays.asList(120,450,90,700,450);List<Integer> slow=times.stream().filter(t->t>300).distinct().sorted().collect(Collectors.toList());double avg=times.stream().mapToInt(Integer::intValue).average().orElse(0);System.out.println(slow);System.out.println(avg);}
}