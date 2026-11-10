package com.learnjava.oop;
public abstract class PaymentInstrument {
 private final String reference;
 protected PaymentInstrument(String reference) {
  if(reference==null || reference.isBlank()) throw new IllegalArgumentException("reference required");
  this.reference=reference;
 }
 public final String reference() { return reference; }
 public abstract String authorize(long amountInMinorUnits);
}
