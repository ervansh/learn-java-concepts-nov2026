package com.learnjava.accessmodifiers;
class Credentials{private final String token;Credentials(String t){token=t;}public boolean configured(){return token!=null&&!token.isEmpty();}}
public class AccessModifiersDemo{public static void main(String[] args){System.out.println(new Credentials("configured").configured());}}
