package com.learnjava.exceptions;
public final class ExceptionsDemo {
 private ExceptionsDemo() { }
 private static int parsePositive(String raw) throws DataFormatException {
  try { int value=Integer.parseInt(raw); if(value<=0) throw new DataFormatException("Value must be positive",null); return value; }
  catch(NumberFormatException cause) { throw new DataFormatException("Expected an integer: "+raw,cause); }
 }
 public static void main(String[] args) {
  try { System.out.println(parsePositive("24")); }
  catch(DataFormatException failure) { System.err.println(failure.getMessage()); }
 }
}
