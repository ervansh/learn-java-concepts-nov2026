package com.learnjava.basics;
public class JavaBasicsDemo {
 public static void main(String[] args) {
  int retryCount=3; double elapsedSeconds=1.25; boolean passed=elapsedSeconds<2.0;
  String testName="Login test";
  System.out.println(testName+" passed="+passed+", retries="+retryCount);
  long widened=retryCount; int narrowed=(int)elapsedSeconds;
  System.out.println("widened="+widened+", narrowed="+narrowed);
 }
}