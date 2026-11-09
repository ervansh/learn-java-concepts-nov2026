package com.learnjava.oop;
abstract class TestCase {
 private final String name;
 TestCase(String name){this.name=name;}
 public String getName(){return name;}
 abstract void execute();
}
class ApiTestCase extends TestCase {
 ApiTestCase(String name){super(name);}
 @Override void execute(){System.out.println(getName()+" executed");}
}
public class OopDemo {
 public static void main(String[] args){TestCase test=new ApiTestCase("Health API");test.execute();}
}