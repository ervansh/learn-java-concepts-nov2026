package com.learnjava.designpatterns;
public final class DesignPatternsDemo {
 private DesignPatternsDemo() { }
 public static void main(String[] args) {
  PricingStrategy policy=new MemberPricing();
  System.out.println("member price="+policy.priceInMinorUnits(10000));
  policy=new StandardPricing();
  System.out.println("standard price="+policy.priceInMinorUnits(10000));
 }
}
