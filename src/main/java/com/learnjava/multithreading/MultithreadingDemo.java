package com.learnjava.multithreading;
public final class MultithreadingDemo {
 private MultithreadingDemo() { }
 public static void main(String[] args) throws InterruptedException {
  Thread worker=new Thread(() -> System.out.println("Worker thread: "+Thread.currentThread().getName()),"report-worker");
  worker.start(); worker.join(); System.out.println("Main thread completed");
 }
}
