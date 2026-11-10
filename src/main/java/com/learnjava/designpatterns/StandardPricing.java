package com.learnjava.designpatterns;
public final class StandardPricing implements PricingStrategy {
 @Override public long priceInMinorUnits(long basePrice) { if(basePrice<0) throw new IllegalArgumentException("negative price"); return basePrice; }
}
