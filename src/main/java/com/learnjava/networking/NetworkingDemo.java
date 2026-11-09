package com.learnjava.networking;
import java.net.*;
public class NetworkingDemo{public static void main(String[] args)throws Exception{HttpURLConnection c=(HttpURLConnection)new URL("https://example.com").openConnection();c.setRequestMethod("GET");c.setConnectTimeout(3000);c.setReadTimeout(3000);try{System.out.println("HTTP status: "+c.getResponseCode());}finally{c.disconnect();}}}
