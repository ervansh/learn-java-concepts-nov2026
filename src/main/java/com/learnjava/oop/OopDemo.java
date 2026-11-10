package com.learnjava.oop;
public final class OopDemo {
 private OopDemo() { }
 public static void main(String[] args) {
  PaymentInstrument instrument=new GiftCard("GC-204",25000);
  System.out.println(instrument.reference()+" -> "+instrument.authorize(12500));
 }
}
