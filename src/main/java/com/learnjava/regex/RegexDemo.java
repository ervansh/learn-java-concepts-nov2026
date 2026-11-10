package com.learnjava.regex;
import java.util.regex.*;
public final class RegexDemo {
 private static final Pattern VERSION=Pattern.compile("(?<major>\\d+)\\.(?<minor>\\d+)\\.(?<patch>\\d+)");
 private RegexDemo() { }
 public static void main(String[] args) {
  Matcher matcher=VERSION.matcher("release-25.1.3");
  if(matcher.find()) System.out.printf("major=%s minor=%s patch=%s%n",matcher.group("major"),matcher.group("minor"),matcher.group("patch"));
 }
}
