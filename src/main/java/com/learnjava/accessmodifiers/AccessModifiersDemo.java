package com.learnjava.accessmodifiers;

import java.math.BigDecimal;

public final class AccessModifiersDemo {
    private BigDecimal balance;
    public AccessModifiersDemo(BigDecimal openingBalance) {
        if (openingBalance == null || openingBalance.signum() < 0) throw new IllegalArgumentException("invalid opening balance");
        this.balance = openingBalance;
    }
    public void deposit(BigDecimal amount) {
        if (amount == null || amount.signum() <= 0) throw new IllegalArgumentException("deposit must be positive");
        balance = balance.add(amount);
    }
    public BigDecimal balance() { return balance; }
    public static void main(String[] args) {
        var account = new AccessModifiersDemo(new BigDecimal("100.00"));
        account.deposit(new BigDecimal("25.50"));
        System.out.println("balance=" + account.balance());
    }
}
