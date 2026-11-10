package com.learnjava.wrappers;
public class WrapperClassesDemo{public static void main(String[] args){int primitive=10;Integer boxed=Integer.valueOf(primitive);int unboxed=boxed;Integer parsed=Integer.valueOf("42");System.out.println(unboxed+parsed);Integer missing=null;System.out.println(missing==null);}}
