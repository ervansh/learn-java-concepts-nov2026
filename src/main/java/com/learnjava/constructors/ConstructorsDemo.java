package com.learnjava.constructors;
class BrowserConfig {
 private final String browser; private final boolean headless;
 BrowserConfig(){this("chrome",false);}
 BrowserConfig(String browser){this(browser,false);}
 BrowserConfig(String browser,boolean headless){this.browser=browser;this.headless=headless;}
 public String toString(){return browser+", headless="+headless;}
}
public class ConstructorsDemo {
 public static void main(String[] args){System.out.println(new BrowserConfig());System.out.println(new BrowserConfig("firefox",true));}
}