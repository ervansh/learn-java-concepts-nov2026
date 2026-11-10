package com.learnjava.enums;
public enum OrderState {
 CREATED("C"), PAID("P"), SHIPPED("S"), CANCELLED("X");
 private final String externalCode;
 OrderState(String code) { externalCode=code; }
 public String externalCode() { return externalCode; }
}
