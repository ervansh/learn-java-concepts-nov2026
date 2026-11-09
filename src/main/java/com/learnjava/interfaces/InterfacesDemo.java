package com.learnjava.interfaces;
interface Browser {
 void open(String url);
 default void maximize(){System.out.println("Window maximized");}
 static boolean supported(String name){return "chrome".equalsIgnoreCase(name)||"firefox".equalsIgnoreCase(name);}
}
class ChromeBrowser implements Browser { public void open(String url){System.out.println("Chrome opens "+url);} }
public class InterfacesDemo {
 public static void main(String[] args){Browser browser=new ChromeBrowser();browser.open("https://example.com");browser.maximize();System.out.println(Browser.supported("chrome"));}
}