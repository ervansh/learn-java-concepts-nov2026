package com.learnjava.serialization;
import java.io.Serializable;
public final class RunSummary implements Serializable {
 private static final long serialVersionUID=1L;
 private final String name;
 private final int completed;
 private transient String diagnosticContext;
 public RunSummary(String name,int completed,String context) { this.name=name; this.completed=completed; this.diagnosticContext=context; }
 @Override public String toString() { return name+" completed="+completed+" context="+diagnosticContext; }
}
