package com.learnjava.filehandling;
import java.io.*;import java.nio.charset.StandardCharsets;import java.nio.file.*;import java.util.*;
public class FileHandlingDemo {
 public static void main(String[] args)throws IOException{Path p=Paths.get("target","sample-report.txt");Files.createDirectories(p.getParent());Files.write(p,Arrays.asList("login=PASS","checkout=FAIL"),StandardCharsets.UTF_8);for(String line:Files.readAllLines(p,StandardCharsets.UTF_8))System.out.println(line);}
}