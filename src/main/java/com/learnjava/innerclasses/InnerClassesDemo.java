package com.learnjava.innerclasses;
public final class InnerClassesDemo {
 private final String reportName="Annual Summary";
 public final class Section { public String heading() { return reportName; } }
 public static final class Defaults { public static final int PAGE_SIZE=50; private Defaults() { } }
 private InnerClassesDemo() { }
 public static void main(String[] args) {
  InnerClassesDemo report=new InnerClassesDemo();
  System.out.println(report.new Section().heading());
  System.out.println("page size="+Defaults.PAGE_SIZE);
 }
}
