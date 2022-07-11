package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hello")
public class HelloWorld {
   public String sayHello(String name)
   {
	   return "hello "+name;
   }
   @Autowired
   private Calculator cal;
   public void hello() {
	   System.out.println("Adding "+cal.add(10, 11));
   }
	
}
