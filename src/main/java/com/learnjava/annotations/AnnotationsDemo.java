package com.learnjava.annotations;
import java.lang.reflect.Method;
public final class AnnotationsDemo {
 private AnnotationsDemo() { }
 @SmokeTest("calculate-total") public void calculateTotal() { }
 public static void main(String[] args) {
  for (Method m : AnnotationsDemo.class.getDeclaredMethods()) {
   SmokeTest metadata=m.getAnnotation(SmokeTest.class);
   if(metadata!=null) System.out.println(m.getName()+" -> "+metadata.value());
  }
 }
}
