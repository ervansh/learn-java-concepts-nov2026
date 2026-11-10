package com.learnjava.solidprinciples;
public final class ConsolePublisher implements ReportPublisher {
 @Override public void publish(String report) { System.out.println(report); }
}
