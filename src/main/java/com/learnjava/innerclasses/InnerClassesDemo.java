package com.learnjava.innerclasses;
public class InnerClassesDemo {
 private String suiteName="Regression";
 class TestCase {void printSuite(){System.out.println(suiteName);}}
 static class Defaults {static final int RETRIES=2;}
 public static void main(String[] args){InnerClassesDemo suite=new InnerClassesDemo();suite.new TestCase().printSuite();System.out.println(Defaults.RETRIES);}
}