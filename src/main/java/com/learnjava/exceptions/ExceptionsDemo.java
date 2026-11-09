package com.learnjava.exceptions;
class TestDataException extends Exception {TestDataException(String message){super(message);}}
public class ExceptionsDemo {
 static void validate(int status)throws TestDataException{if(status<200||status>=300)throw new TestDataException("Unexpected status "+status);}
 public static void main(String[] args){try{validate(503);}catch(TestDataException e){System.err.println(e.getMessage());}finally{System.out.println("Validation finished");}}
}