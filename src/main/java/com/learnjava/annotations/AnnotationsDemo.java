package com.learnjava.annotations;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME) @Target(ElementType.METHOD) @interface SmokeTest{}
class LoginChecks{@SmokeTest public void validLogin(){}}
public class AnnotationsDemo{public static void main(String[] args){for(java.lang.reflect.Method m:LoginChecks.class.getDeclaredMethods())if(m.isAnnotationPresent(SmokeTest.class))System.out.println(m.getName());}}
