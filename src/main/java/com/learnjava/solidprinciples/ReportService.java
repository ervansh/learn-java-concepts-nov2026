package com.learnjava.solidprinciples;
import java.util.Objects;
public final class ReportService {
 private final ReportPublisher publisher;
 public ReportService(ReportPublisher publisher) { this.publisher=Objects.requireNonNull(publisher); }
 public void publish(String result) { publisher.publish("Summary: "+result); }
}
