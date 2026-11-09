package com.learnjava.arrays;
import java.util.Arrays;
public class ArraysDemo {
 public static void main(String[] args) {
  int[] codes={200,500,201,404}; int[] sorted=Arrays.copyOf(codes,codes.length);
  Arrays.sort(sorted); System.out.println(Arrays.toString(sorted));
  System.out.println("404 index="+Arrays.binarySearch(sorted,404));
  int[][] matrix={{1,2},{3,4}};
  for(int[] row:matrix) System.out.println(Arrays.toString(row));
 }
}