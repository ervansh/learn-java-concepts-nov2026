package com.learnjava.regex;
import java.util.regex.*;
public class RegexDemo {
 public static void main(String[] args){Pattern p=Pattern.compile("^(PASS|FAIL):\\s+(.+)$");Matcher m=p.matcher("FAIL: checkout not visible");if(m.matches()){System.out.println(m.group(1));System.out.println(m.group(2));}}
}