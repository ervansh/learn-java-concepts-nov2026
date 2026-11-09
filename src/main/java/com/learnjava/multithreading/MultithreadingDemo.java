package com.learnjava.multithreading;
public class MultithreadingDemo {
 public static void main(String[] args)throws InterruptedException{Thread worker=new Thread(new Runnable(){public void run(){System.out.println("Worker: "+Thread.currentThread().getName());}},"api-check-worker");worker.start();worker.join();System.out.println("Main completed");}
}