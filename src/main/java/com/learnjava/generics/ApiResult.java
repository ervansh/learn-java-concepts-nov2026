package com.learnjava.generics;
import java.util.Objects;
public final class ApiResult<T> {
 private final T body;
 public ApiResult(T body) { this.body=Objects.requireNonNull(body); }
 public T body() { return body; }
}
