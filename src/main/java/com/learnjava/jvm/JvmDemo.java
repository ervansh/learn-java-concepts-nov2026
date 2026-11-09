package com.learnjava.jvm;
public class JvmDemo {
 static class TestData {private final byte[] payload=new byte[1024];int size(){return payload.length;}}
 public static void main(String[] args){TestData data=new TestData();System.out.println("Payload bytes: "+data.size());data=null;System.out.println("Object may be garbage-collected when unreachable.");}
}