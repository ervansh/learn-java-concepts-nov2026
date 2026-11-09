package com.learnjava.oop;
public final class GiftCard extends PaymentInstrument {
 private final long balanceInMinorUnits;
 public GiftCard(String reference,long balance) {
  super(reference); if(balance<0) throw new IllegalArgumentException("negative balance"); balanceInMinorUnits=balance;
 }
 @Override public String authorize(long amount) { return amount>0 && amount<=balanceInMinorUnits ? "APPROVED" : "DECLINED"; }
}
