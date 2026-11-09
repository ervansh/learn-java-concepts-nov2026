package com.learnjava.generics;
import java.util.*;
class ApiResult<T>{private final T body;ApiResult(T body){this.body=body;}T getBody(){return body;}}
public class GenericsDemo {
 static double sum(List<? extends Number> values){double total=0;for(Number n:values)total+=n.doubleValue();return total;}
 public static void main(String[] args){ApiResult<String> result=new ApiResult<String>("created");System.out.println(result.getBody());System.out.println(sum(Arrays.<Number>asList(10,2.5,3)));}
}