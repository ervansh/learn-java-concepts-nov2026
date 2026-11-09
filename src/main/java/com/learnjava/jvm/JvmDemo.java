package com.learnjava.jvm;
public final class JvmDemo {
 private JvmDemo() { }
 private static final class Payload { private final byte[] bytes=new byte[1024]; int size(){return bytes.length;} }
 public static void main(String[] args) {
  Runtime runtime=Runtime.getRuntime();
  System.out.println("java="+System.getProperty("java.version"));
  System.out.println("vm="+System.getProperty("java.vm.name"));
  System.out.println("processors="+runtime.availableProcessors());
  Payload payload=new Payload(); System.out.println("payload bytes="+payload.size());
 }
}
