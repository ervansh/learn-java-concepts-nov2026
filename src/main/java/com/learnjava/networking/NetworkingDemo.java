package com.learnjava.networking;
import java.net.URI;
import java.net.http.*;
import java.time.Duration;
public final class NetworkingDemo {
 private NetworkingDemo() { }
 public static void main(String[] args) throws Exception {
  String endpoint=System.getenv().getOrDefault("DEMO_ENDPOINT","https://example.com");
  HttpClient client=HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();
  HttpRequest request=HttpRequest.newBuilder(URI.create(endpoint)).timeout(Duration.ofSeconds(10)).GET().build();
  HttpResponse<Void> response=client.send(request,HttpResponse.BodyHandlers.discarding());
  System.out.println("HTTP status="+response.statusCode());
  if(response.statusCode()>=500) throw new IllegalStateException("Remote server error");
 }
}
