package com.learnjava.oop;

abstract class PaymentInstrument {
    private final String reference;
    protected PaymentInstrument(String reference) {
        if (reference == null || reference.isBlank()) throw new IllegalArgumentException("reference required");
        this.reference = reference;
    }
    public final String reference() { return reference; }
    public abstract String authorize(long amountInPaise);
}

final class GiftCard extends PaymentInstrument {
    private final long balanceInPaise;
    GiftCard(String reference, long balanceInPaise) {
        super(reference);
        if (balanceInPaise < 0) throw new IllegalArgumentException("negative balance");
        this.balanceInPaise = balanceInPaise;
    }
    @Override public String authorize(long amountInPaise) {
        return amountInPaise > 0 && amountInPaise <= balanceInPaise ? "APPROVED" : "DECLINED";
    }
}

public final class OopDemo {
    private OopDemo() { }
    public static void main(String[] args) {
        PaymentInstrument instrument = new GiftCard("GC-204", 250_00);
        System.out.println(instrument.reference() + " -> " + instrument.authorize(125_00));
    }
}
