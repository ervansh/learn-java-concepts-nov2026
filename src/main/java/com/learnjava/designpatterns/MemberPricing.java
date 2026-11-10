package com.learnjava.designpatterns;
public final class MemberPricing implements PricingStrategy {
 @Override public long priceInMinorUnits(long basePrice) { if(basePrice<0) throw new IllegalArgumentException("negative price"); return Math.round(basePrice*0.90); }
}
