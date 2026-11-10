package com.learnjava.enums;
public final class EnumsDemo {
 private EnumsDemo() { }
 public static void main(String[] args) {
  OrderState state=OrderState.PAID;
  System.out.println(state+" code="+state.externalCode());
  System.out.println(java.util.EnumSet.allOf(OrderState.class));
 }
}
