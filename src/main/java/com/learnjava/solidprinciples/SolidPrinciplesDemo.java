package com.learnjava.solidprinciples;
interface ReportPublisher{void publish(String report);}
class ConsolePublisher implements ReportPublisher{public void publish(String report){System.out.println(report);}}
class TestReportService{private final ReportPublisher publisher;TestReportService(ReportPublisher p){publisher=p;}void publish(String result){publisher.publish("Test result: "+result);}}
public class SolidPrinciplesDemo{public static void main(String[] args){new TestReportService(new ConsolePublisher()).publish("PASS");}}
