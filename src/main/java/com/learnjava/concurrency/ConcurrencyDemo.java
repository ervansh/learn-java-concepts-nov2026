package com.learnjava.concurrency;
import java.util.concurrent.*;
public class ConcurrencyDemo {
 public static void main(String[] args)throws Exception{ExecutorService pool=Executors.newFixedThreadPool(2);try{Future<Integer> f=pool.submit(new Callable<Integer>(){public Integer call(){return 200;}});System.out.println("HTTP status="+f.get(2,TimeUnit.SECONDS));}finally{pool.shutdown();if(!pool.awaitTermination(2,TimeUnit.SECONDS))pool.shutdownNow();}}
}