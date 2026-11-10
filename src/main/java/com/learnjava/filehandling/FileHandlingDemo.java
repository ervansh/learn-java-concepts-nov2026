package com.learnjava.filehandling;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
public final class FileHandlingDemo {
 private FileHandlingDemo() { }
 public static void main(String[] args) throws Exception {
  Path file=Files.createTempFile("java-learning-", ".txt");
  try {
   Files.writeString(file,"invoice=INV-1001\namount=1250.00\n",StandardCharsets.UTF_8);
   System.out.println(Files.readString(file,StandardCharsets.UTF_8));
  } finally { Files.deleteIfExists(file); }
 }
}
