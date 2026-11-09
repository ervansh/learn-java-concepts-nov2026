package com.learnjava.designpatterns;
interface BrowserDriver{void start();}
class ChromeDriver implements BrowserDriver{public void start(){System.out.println("Chrome started");}}
class FirefoxDriver implements BrowserDriver{public void start(){System.out.println("Firefox started");}}
class DriverFactory{static BrowserDriver create(String name){if("chrome".equalsIgnoreCase(name))return new ChromeDriver();if("firefox".equalsIgnoreCase(name))return new FirefoxDriver();throw new IllegalArgumentException("Unsupported browser "+name);}}
public class DesignPatternsDemo{public static void main(String[] args){DriverFactory.create("chrome").start();}}
