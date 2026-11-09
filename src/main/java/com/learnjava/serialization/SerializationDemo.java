package com.learnjava.serialization;
import java.io.*;
public final class SerializationDemo {
 private SerializationDemo() { }
 public static void main(String[] args) throws Exception {
  byte[] bytes;
  try(var buffer=new ByteArrayOutputStream();var output=new ObjectOutputStream(buffer)) {
   output.writeObject(new RunSummary("monthly",42,"temporary-context")); output.flush(); bytes=buffer.toByteArray();
  }
  try(var input=new ObjectInputStream(new ByteArrayInputStream(bytes))) { System.out.println(input.readObject()); }
 }
}
