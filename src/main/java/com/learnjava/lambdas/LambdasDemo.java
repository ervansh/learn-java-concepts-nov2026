package com.learnjava.lambdas;
import java.util.List;
import java.util.function.Predicate;
public final class LambdasDemo {
 private LambdasDemo() { }
 record Invoice(String number,long amountMinor,boolean paid) { }
 public static void main(String[] args) {
  List<Invoice> invoices=List.of(new Invoice("INV-1",12000,true),new Invoice("INV-2",0,true),new Invoice("INV-3",9000,false));
  Predicate<Invoice> positive=invoice -> invoice.amountMinor()>0;
  Predicate<Invoice> paid=Invoice::paid;
  invoices.stream().filter(positive.and(paid)).map(Invoice::number).forEach(System.out::println);
 }
}
