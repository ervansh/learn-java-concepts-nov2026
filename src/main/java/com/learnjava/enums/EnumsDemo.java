package com.learnjava.enums;
enum TestStatus {PASSED,FAILED,SKIPPED}
public class EnumsDemo {
 public static void main(String[] args){TestStatus status=TestStatus.FAILED;switch(status){case PASSED:System.out.println("Record success");break;case FAILED:System.out.println("Capture failure");break;default:System.out.println("No execution");}System.out.println(TestStatus.valueOf("PASSED"));}
}