package com.learnjava.controlflow;
public class ControlFlowDemo {
 public static void main(String[] args) {
  int status=503;
  if(status>=200 && status<300) System.out.println("Success");
  else if(status>=500) System.out.println("Server error");
  else System.out.println("Other response");
  String env="QA";
  switch(env) { case "QA": System.out.println("QA config"); break; case "STAGE": System.out.println("Stage config"); break; default: System.out.println("Unknown"); }
  for(int attempt=1;attempt<=3;attempt++){ if(attempt==2) continue; System.out.println("Attempt "+attempt); }
 }
}