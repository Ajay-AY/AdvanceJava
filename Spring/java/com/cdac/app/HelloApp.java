package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.HelloWorld;

public class HelloApp {
   
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
          HelloWorld hw = (HelloWorld) ctx.getBean("hello");
          System.out.println(hw.sayHello("Ajay"));
          hw.hello();

	}

}
