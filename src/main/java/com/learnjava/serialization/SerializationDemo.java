package com.learnjava.serialization;
import java.io.*;
class RunSummary implements Serializable{private static final long serialVersionUID=1L;private final String suite;private transient String token;RunSummary(String s,String t){suite=s;token=t;}public String toString(){return suite+", token="+token;}}
public class SerializationDemo{public static void main(String[] args)throws Exception{RunSummary value=new RunSummary("Regression","sensitive");ByteArrayOutputStream bytes=new ByteArrayOutputStream();ObjectOutputStream out=new ObjectOutputStream(bytes);out.writeObject(value);out.close();ObjectInputStream in=new ObjectInputStream(new ByteArrayInputStream(bytes.toByteArray()));System.out.println(in.readObject());in.close();}}
