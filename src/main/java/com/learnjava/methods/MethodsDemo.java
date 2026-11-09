package com.learnjava.methods;
public class MethodsDemo {
 static int add(int a,int b){return a+b;}
 static int sum(int... values){int total=0;for(int v:values)total+=v;return total;}
 static long factorial(int n){if(n<0)throw new IllegalArgumentException("negative");return n<=1?1:n*factorial(n-1);}
 public static void main(String[] args){System.out.println(add(2,3));System.out.println(sum(1,2,3));System.out.println(factorial(5));}
}