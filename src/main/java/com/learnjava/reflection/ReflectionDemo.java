package com.learnjava.reflection;
import java.lang.reflect.Method;
class SampleCheck{public void execute(){System.out.println("Executed reflectively");}}
public class ReflectionDemo{public static void main(String[] args)throws Exception{Class<?> type=SampleCheck.class;Object instance=type.newInstance();Method method=type.getMethod("execute");method.invoke(instance);System.out.println(type.getName());}}
