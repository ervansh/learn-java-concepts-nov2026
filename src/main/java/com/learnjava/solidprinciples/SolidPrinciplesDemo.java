package com.learnjava.solidprinciples;
public final class SolidPrinciplesDemo {
 private SolidPrinciplesDemo() { }
 public static void main(String[] args) { new ReportService(new ConsolePublisher()).publish("monthly revenue calculated"); }
}
