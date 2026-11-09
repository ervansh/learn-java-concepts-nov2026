package com.learnjava.strings;
public class StringsDemo {
 public static void main(String[] args) {
  String a="login", b=new String("login");
  System.out.println(a==b); System.out.println(a.equals(b));
  StringBuilder report=new StringBuilder();
  for(int i=1;i<=3;i++) report.append("Test ").append(i).append(": PASS").append(System.lineSeparator());
  System.out.println(report);
 }
}