package com.learnjava.strings;
public final class StringsDemo {
 private StringsDemo() { }
 public static void main(String[] args) {
  String customer="  Asha Sharma  ";
  StringBuilder message=new StringBuilder("Welcome, ");
  message.append(customer.strip()).append("!");
  System.out.println(message);
  System.out.println("is blank? "+"   ".isBlank());
  System.out.println("separator="+"-".repeat(16));
 }
}
