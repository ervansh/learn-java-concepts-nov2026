package com.learnjava.reflection;
import java.lang.reflect.Method;
public final class ReflectionDemo {
 private ReflectionDemo() { }
 public static void main(String[] args) throws Exception {
  Class<?> type=Describable.class; Object instance=type.getDeclaredConstructor().newInstance();
  Method method=type.getMethod("describe");
  System.out.println("type="+type.getName()); System.out.println(method.invoke(instance));
 }
}
